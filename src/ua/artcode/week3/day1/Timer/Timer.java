package ua.artcode.week3.day1.timer;

/**
 * Created by admin on 21.06.2014.
 */
public class Timer {

    public MyAction action;

    public Timer(MyAction action) {
        this.action = action;
    }

    public void start(){
        long start = System.currentTimeMillis();
        while(true){
            if((System.currentTimeMillis() - start) / 1000 >= 3){
                action.perform();
                start = System.currentTimeMillis();
            }
        }
    }

}
