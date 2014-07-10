package ua.artcode.ua.artcode.week5.day1.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by mike on 7/5/14.
 */
public class atomic {

    public static void main(String[] args) {
        //коли одна змінна юзається двома потоками
        //значить що в один момент часу з нею може працювати тіьки один потік
        AtomicInteger atomicInteger = new AtomicInteger(45);
    }
}
