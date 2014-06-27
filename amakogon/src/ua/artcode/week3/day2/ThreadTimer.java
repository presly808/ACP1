package ua.artcode.week3.day2;

import java.util.Date;

/**
 * Created by amakogon on 22.06.2014.
 */
public class ThreadTimer {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Date current = new Date();
                while (!Thread.currentThread().isInterrupted()) {

                    if (new Date().getTime() - current.getTime() >= 3 * 1000) {
                        System.out.println(current);
                        current = new Date();
                    }
                }
                Thread.currentThread().interrupt();
            }
        });
        thread1.start();


        Thread.sleep(10000);
        thread1.interrupt();
    }
}
