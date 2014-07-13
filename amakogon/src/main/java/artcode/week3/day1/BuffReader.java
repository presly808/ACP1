package main.java.artcode.week3.day1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created by amakogon on 21.06.2014.
 */
public class BuffReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:/ArtCode/buffer.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        byte[] buff = new byte[10000];
        bufferedInputStream.read(buff,0,buff.length);
//
//        for (byte b : buff){
//            System.out.print((char) b);
//        }

        String s = new String(buff);
        System.out.println(s);
        String s1 = new String(buff, Charset.forName("UTF-8"));
        System.out.println(s);



    }

}
