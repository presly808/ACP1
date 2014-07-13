package main.java.artcode.week3.day1.thread;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by amakogon on 21.06.2014.
 */
public class FileReader{

    private byte[] buff;

    public FileReader(String filePath, byte[] buff) {
        this.buff = buff;
    }

    public FileReader() {
        buff = new byte[100];
    }

    public byte[] getBuff() {
        return buff;
    }

    public synchronized void read(String filePath){
        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedInputStream.read(buff,0,buff.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
