package main.java.artcode.week3.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by amakogon on 27.06.2014.
 */
public class FileSearcher {

    private FileWriter writer;
    private BufferedWriter bufferedWriter;

    public FileSearcher(String filePath) {
        try {
            writer = new FileWriter(filePath, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        bufferedWriter = new BufferedWriter(writer);
    }

    public void searchFileInDirectory(File file, String fileName) {

        File[] list = file.listFiles();
        for (int i = 0; i < list.length; i++) {
            if (!list[i].isDirectory()
                    && list[i].getName().equals(fileName + ".txt")) {
//                System.out.println(list[i].getAbsolutePath());
                write(list[i].getAbsolutePath());
            } else if (list[i].isDirectory() && !list[i].isHidden()) {

                searchFileInDirectory(list[i], fileName);
            }
        }
    }

    private synchronized void write(String fileName){
        try {
            bufferedWriter.write(fileName + "\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
