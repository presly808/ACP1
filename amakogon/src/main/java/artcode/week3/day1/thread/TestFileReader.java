package artcode.week3.day1.thread;

/**
 * Created by amakogon on 21.06.2014.
 */
public class TestFileReader {
    public static void main(String[] args) {

        final String path = "D:/ArtCode/file1.txt";
        final String path1 = "D:/ArtCode/file2.txt";
        final FileReader reader = new FileReader();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                reader.read(path);
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                reader.read(path1);
            }
        });
        thread.start();
        thread1.start();
        System.out.println(new String(reader.getBuff()));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(new String(reader.getBuff()));


    }
}
