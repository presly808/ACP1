package ua.artcode.week3.day1;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by admin on 21.06.2014.
 */
public class MyScanner {

    private Reader reader;

    public MyScanner(Reader reader) {
        this.reader = reader;
    }

    public String next() throws IOException {
        String s = "";

        int readedChar = 0;
        while((readedChar = reader.read()) != -1 && readedChar != ' '){
            s += (char)readedChar;
        }

        return s;
    }


}
