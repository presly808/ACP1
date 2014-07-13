package main.java.artcode.week2.homework.Timer;

import java.util.Date;

/**
 * Created by amakogon on 20.06.2014.
 */
public class Timer implements Runnable {
    private boolean started;
    private long delay;
    private Action action;


    public void start(long delay, Action action) {
        this.delay = delay;
        this.action = action;
        this.run();
    }

    public void stop() {
        started = false;
    }

    @Override
    public void run() {
        started = true;
        Date current = new Date();
        while (started) {
            if (new Date().getTime() - current.getTime() == delay * 1000) {
                action.perform();
                current = new Date();
            }
        }
    }
}
