package ua.artcode.week4.day1.socket;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.lang.management.BufferPoolMXBean;
import java.net.Socket;

/**
 * Created by mike on 6/28/14.
 */
public class Client {


    public void connect() throws IOException {
        Socket socket = new Socket("192.168.1.34", 9912);
        BufferedInputStream bufferedInputStream = new BufferedInputStream( socket.getInputStream() );
        byte[] buff = new byte[1000];
        bufferedInputStream.read(buff);
    }
}
