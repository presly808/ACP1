package ua.artcode.week3.day2.threads;

import ua.artcode.week3.day1.timer.MyAction;
import ua.artcode.week3.day1.timer.Timer;

import java.util.Scanner;

/**
 * Created by admin on 22.06.2014.
 */
public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                new Timer(new MyAction() {
                    @Override
                    public void perform() {
                        System.out.println("some");
                    }
                }).start();
            }
        });
        t.start();


        System.out.println("Bread was prepared!");

        t.join(4000);
        t.interrupt();
        System.out.println(t.getState());

    }
}
