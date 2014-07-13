package artcode.week4.homework.skype.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Created by amakogon on 03.07.2014.
 */
public class ChatServer {

    private static final int MAX_CLIENTS = 2;
    private List<PrintWriter> clientOutputStreams;
    private final int serverPort;

    private Map<Socket, PrintWriter> clientWriters;

    private Logger logger;


    public ChatServer(int serverPort) {
        this.serverPort = serverPort;
        startServer();
    }

    public class ClientHandler implements Runnable {
        private BufferedReader reader;
        private Socket sock;


        public ClientHandler(Socket clientSocket) {
            try {
                sock = clientSocket;
                InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(isReader);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    if (message.contains("^^&&^^exit!@qwe")) {
                        System.out.println(message);
                        clientOutputStreams.remove(clientWriters.get(sock));

                    } else {
                        tellEveryone(message);
                        logger.info(message);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void startServer() {
        clientOutputStreams = new ArrayList<PrintWriter>();
        clientWriters = new HashMap<Socket, PrintWriter>();
        createLogger();

        try {
            ServerSocket serverSock = new ServerSocket(serverPort);

            while (!Thread.currentThread().isInterrupted()) {
                if (clientWriters.size() < MAX_CLIENTS) {
                    Socket clientSocket = serverSock.accept();
                    logger.info("client connected: " + clientSocket.getInetAddress() + ":" + clientSocket.getLocalPort());
                    PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                    clientOutputStreams.add(writer);
                    clientWriters.put(clientSocket, writer);
                    writer.println("Hello from server");
                    writer.flush();
                    Thread thread = new Thread(new ClientHandler(clientSocket));
                    thread.start();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void createLogger() {
        logger = Logger.getLogger("MyLog");
        try {
            FileHandler fh = new FileHandler("amakogon/resources/chatLog");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private synchronized void tellEveryone(String message) {
//        Iterator<PrintWriter> iterator = clientWriters.values().iterator();
//        while (iterator.hasNext()){
//            PrintWriter writer = iterator.next();
//            writer.println(message);
//            writer.flush();
//        }
        for (PrintWriter writer : clientOutputStreams) {
            writer.println(message);
            writer.flush();
        }

    }

    public static void main(String[] args) {
        new ChatServer(5000);
    }
}
