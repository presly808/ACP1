package ua.artcode.week2.homework;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

/**
 * Created by amakogon on 20.06.2014.
 */
public class MyScanner implements Closeable {

    private InputStream reader;
    private boolean closed;

    public MyScanner(InputStream reader) {
        this.reader = reader;
    }

    public MyScanner() {
        this.reader = System.in;
    }

    @Override
    public void close() throws IOException {
        if(closed) {
            return;
        }
        if(reader instanceof Closeable){
            reader.close();
        }
        reader = null;
        closed = true;
    }

    public int nextInt() {

        int charNum = 48;
        StringBuilder builder = new StringBuilder();
        try {
            while (charNum >= 48 && charNum <= 57) {
                charNum = reader.read();
                if ((charNum >= 48 && charNum <= 57) || charNum == 10) {
                    if (charNum == 10) break;
                    builder.append(charNum - 48);
                } else {
                    throw new InputMismatchException();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Integer.valueOf(builder.toString());
    }

    public String next() {
        StringBuilder builder = new StringBuilder();
        try {
            int charNum = reader.read();
            while (charNum != 10 && charNum != 32) {
                builder.append((char)charNum);
                charNum = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }

    public String nextLine() {
        StringBuilder builder = new StringBuilder();
        try {
            int charNum = reader.read();
            while (charNum != 10) {
                builder.append((char)charNum);
                charNum = reader.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
}
