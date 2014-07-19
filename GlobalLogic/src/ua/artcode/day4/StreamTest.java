package ua.artcode.day4;

import java.io.*;
import java.util.Scanner;

/**
 * Created by admin on 16.07.2014.
 */
public class StreamTest {

    /*
    * Stream
    * byte - InputStream , OutputStream
    *
    * */
    private static final String PATH = "e:/dev/IDEA_Projects/ACP1/GlobalLogic/mydata.txt";

    public static void main(String[] args) throws IOException {

        //write("New sequence for test", PATH);
        //testCharStream(PATH);
        String file = readFileByScanner(PATH);
        System.out.println(file);
    }

    private static void testByteStream() throws IOException {
        FileInputStream fis = new FileInputStream(PATH);
        int read = -1;
        while((read = fis.read()) != -1){
            System.out.print((char) read);
        }
    }

    public static void testCharStream(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        int read = fileReader.read();
        for(;read != -1; read = fileReader.read()){
            System.out.print((char) read);
        }
    }

    public static void write(String seq ,String path) throws IOException {
        FileWriter fw = new FileWriter(path);
        fw.write(seq);
        fw.flush();
        fw.close();

    }

    public static String readFileByScanner(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        String dest = "";
        while(sc.hasNextLine()){
            dest += sc.nextLine()+"\n";
        }

        return dest;
    }

}
