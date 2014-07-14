package artcode.week3.homework;

import java.io.File;

/**
 * Created by amakogon on 27.06.2014.
 */
public class TestFileSearcher {
    public static void main(String[] args) {
        final FileSearcher searcher = new FileSearcher("D:/ArtCode/searchResult.txt");
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                searcher.searchFileInDirectory(new File("D:/ArtCode/"),"file1");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                searcher.searchFileInDirectory(new File("D:/amakogon/"),"file1");
            }
        });

        thread1.start();
        thread2.start();
    }
}
