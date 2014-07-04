package ua.artcode.week2.day2.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by admin on 15.06.2014.
 */
public class TestIO {

    public static void main(String[] args) throws IOException {

        byte[] buff = new byte[100];



        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("e:/dev/test.txt"));

        Scanner sc = new Scanner(new FileInputStream("e:/dev/test.txt"));
        sc.next();

        bis.read(buff);

        System.out.println(new String(buff));

    }
}
