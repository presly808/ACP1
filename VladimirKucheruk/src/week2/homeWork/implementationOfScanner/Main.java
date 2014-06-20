package week2.homeWork.implementationOfScanner;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by vkucheru on 19.06.2014.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        MyScanner myScanner = new MyScanner("d:/test.txt");
        while (myScanner.hasNext()) {
            System.out.println(myScanner.nextLine());
        }
    }
}
