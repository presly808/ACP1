package ua.artcode.week4.day1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by admin on 28.06.2014.
 */
public class ChatClient {

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        Socket socket = new Socket("192.168.1.41", 8189);

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        InputStream inputStream = socket.getInputStream();
        BufferedReader socketInput = new BufferedReader(new InputStreamReader(inputStream));


        while (true) {

            //waiting from another
            System.out.println(socketInput.readLine());

            System.out.println("Write message");
            String mess = console.readLine();
            printWriter.println(mess);
            printWriter.flush();
        }
    }
}
