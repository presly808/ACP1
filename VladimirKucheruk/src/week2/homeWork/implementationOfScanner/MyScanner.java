package week2.homeWork.implementationOfScanner;

import java.io.*;
import java.util.Iterator;

/**
 * Created by vkucheru on 18.06.2014.
 */
public class MyScanner {

    private Reader reader;
    private int maxBuffer = 1024;
    private char[] charBuffer = new char[maxBuffer];
    private String str;
    private boolean fileClose = false;
    private int marker = -1;
    private int maxCount = 0;
    public MyScanner(String fileName) throws IOException {
        reader = new FileReader(fileName);
        if (reader.ready()) maxCount=reader.read(charBuffer);
        if (maxCount<maxBuffer) if (!reader.ready()) fileClose=true;
    }

    public String next() {
        String outStr = "";
        for (int i=0; i<maxCount; i++) {
            marker++;
            if (charBuffer[marker]==' ') break;
            outStr=outStr+charBuffer[marker];
        }
        return outStr;
    }

    public String nextLine() {
        String outStr = "";
        for (int i=0; i<maxCount; i++) {
            marker++;
            if (charBuffer[marker]=='\n') break;
            outStr=outStr+charBuffer[marker];
        }
        return outStr;
    }

    public int nextInt() {
        return marker;
    }

    public boolean hasNext() {
        if (marker<maxCount) return true; else return false;
    }

    public boolean hasNextInt() {
        if (marker<maxCount) return true; else return false;
    }

    public void useDelemiter(String str) {

    }

    public void close() throws IOException {
        reader.close();
    }
}
