package artcode.week4.homework.skype;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by amakogon on 01.07.2014.
 */
public class ClientChat implements Observer {

    private Socket server;
    private InputStream inputStream;
    private OutputStream outputStream;
    private String nickName;
    private Socket clientSocket;

    public Socket getClientSocket() {
        return clientSocket;
    }

    public ClientChat(Socket server,Socket clientSocket, String nickName) {
        this.server = server;
        this.nickName = nickName;
        this.clientSocket = clientSocket;
    }

    @Override
    public void updateChat() {

    }

    @Override
    public void run() {
        try {
            InputStream inputServer = server.getInputStream();
            OutputStream outputServer = server.getOutputStream();
            inputStream = clientSocket.getInputStream();
            outputStream = clientSocket.getOutputStream();
            Scanner in = new Scanner(inputStream);
            PrintWriter out = new PrintWriter(outputStream, true);
            PrintWriter outServer = new PrintWriter(outputServer, true);
            out.println("Hello! Enter BYE to exit");
            boolean done = false;
            while (!done && in.hasNextLine()) {
                String line = in.next();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");
                out.println(simpleDateFormat.format(new Date()) + " " + nickName + " : " + line);
                outServer.println(simpleDateFormat.format(new Date()) + " " + nickName + " : " + line);

                if (line.trim().equals("BYE")) {
                    done = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public OutputStream getOutputStream() {
        return outputStream;
    }

    public Socket getServerSocket() {
        return server;
    }
}
