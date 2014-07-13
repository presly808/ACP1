package ua.artcode.week3.day2.threads;

/**
 * Created by admin on 22.06.2014.
 */
public class ChainTest {
    public static void main(String[] args) {
        new WorkerThread(10, "W").start();
    }
}
