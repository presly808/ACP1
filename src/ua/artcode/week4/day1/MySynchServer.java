package ua.artcode.week4.day1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by admin on 28.06.2014.
 */
public class MySynchServer {

    public static void main(String[] args) throws IOException {
        //192.168.1.34
        //console
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        ServerSocket serverSocket = new ServerSocket(9913);

        Socket socket = serverSocket.accept();

        //get output stream for write message
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        //for receiving messages
        InputStream inputStream = socket.getInputStream();
        BufferedReader socketOutput = new BufferedReader(new InputStreamReader(inputStream));



        while (true) {
            System.out.println("Write message");
            printWriter.println(console.readLine());
            printWriter.flush();

            //waiting from another
            System.out.println(socketOutput.readLine());
        }
    }

}
