package artcode.week3.homework;

/**
 * Created by amakogon on 26.06.2014.
 */
public class ThredEx {

    public static void main(String[] args) {

        Thread thread = new Thread(new Worker());
        thread.start();


        thread.interrupt();

        System.out.println("in main thread");


    }
}
