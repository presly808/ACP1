package ua.artcode.week4.day1.chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by amakogon on 28.06.2014.
 */
public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8189);


        Socket incoming = serverSocket.accept();

//        Socket someSocket = new Socket("192.168.1.41",7423);
        System.out.println(incoming.getInetAddress() + " connector");

        InputStream inputStream = incoming.getInputStream();
        OutputStream outputStream = incoming.getOutputStream();

        while (true){

            Scanner in = new Scanner(inputStream);
            Scanner out = new Scanner(System.in);
            String myMessage = out.nextLine();
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.write(myMessage + "\n");
            printWriter.flush();

            if(in.hasNextLine()){
                String message = in.nextLine();
                System.out.println(message);
            }
        }

    }

}
