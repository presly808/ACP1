package ua.artcode.week4.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by mike on 7/2/14.
 */
public class Server {

    public static void main(String[] args) throws IOException {

        Message testMessage = new Message();

        ServerSocket ss = new ServerSocket(9991);

        Socket socket = ss.accept();
        System.out.println( "new connection was established with IP = " + socket.getInetAddress().getHostAddress() );

        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(testMessage);
        objectOutputStream.flush();

    }

}
