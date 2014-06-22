package ua.artcode.week3.day1.timer;

/**
 * Created by admin on 21.06.2014.
 */
public class TestTimer {

    public static void main(String[] args) {
        Timer t = new Timer(new MyAction() {
            @Override
            public void perform() {
                System.out.println("timer action");            }
        });
        t.start();
    }
}
