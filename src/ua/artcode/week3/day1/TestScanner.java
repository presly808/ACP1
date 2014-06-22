package ua.artcode.week3.day1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;

/**
 * Created by admin on 21.06.2014.
 */
public class TestScanner {

    public static void main(String[] args) throws IOException {
        StringReader sr = new StringReader("new line for test");
        MyScanner sc = new MyScanner(sr);

        byte[] buff = new byte[5];
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("e:/dev/test.txt"));

        int read = 0;
        while((read = bis.read(buff)) != -1){
            String s = new String(buff, 0, read, Charset.forName("UTF-8"));
            System.out.print(s);
        }


    }
}
