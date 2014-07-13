package artcode.week4.homework.skype;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Deque;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by amakogon on 01.07.2014.
 */
public class ServerChat implements Subject {

    private Deque<ClientChat> clients;
    private ServerSocket serverSocket;
    private volatile boolean hasMessage;

    public ServerChat(int socketNumber) {
        clients = new ConcurrentLinkedDeque<ClientChat>();
        try {
            serverSocket = new ServerSocket(socketNumber);
            startChat();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void startChat() {
        int count = 0;
        while (true) {
            try {
                Socket incoming = serverSocket.accept();
                System.out.println(incoming.getInetAddress());
                ClientChat client = new ClientChat(new Socket(serverSocket.getInetAddress(),serverSocket.getLocalPort()),incoming,"User" + count);
                registerClient(client);
                Thread t = new Thread(client);
                t.start();
                count++;
                System.out.println(count);
                checkMessage();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void checkMessage() {
        for(ClientChat chat : clients){
            Scanner scanner = null;
            try {
                scanner = new Scanner(chat.getClientSocket().getInputStream());
                if(scanner.hasNextLine()){
                    System.out.println(scanner.nextLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void registerClient(Observer o) {
        clients.add((ClientChat) o);
    }

    @Override
    public void removeClient(Observer o) {
        clients.remove(o);

    }

    @Override
    public void notifyObservers() {
        for (Observer o : clients) {
            o.updateChat();
        }
    }

    public ServerSocket getServerSocket() {
        return serverSocket;
    }


}
