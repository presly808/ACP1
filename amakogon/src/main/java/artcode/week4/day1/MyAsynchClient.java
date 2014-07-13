package main.java.artcode.week4.day1;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by amakogon on 28.06.2014.
 */
public class MyAsynchClient {
    public static void main(String[] args) throws IOException {
        connect();
    }

    public static void connect() throws IOException {
        Socket socket = new Socket("192.168.1.34",9912);
        BufferedInputStream stream = new BufferedInputStream(socket.getInputStream());
        byte[] buff = new byte[1000];
        stream.read(buff);
        String res = new String(buff);
        System.out.println(res);
    }
}
