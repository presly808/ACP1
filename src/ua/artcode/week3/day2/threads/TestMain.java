package ua.artcode.week3.day2.threads;

/**
 * Created by admin on 22.06.2014.
 */
public class TestMain {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new SeparateAction("1"));
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());



        while(t.isAlive()){
            System.out.println(t.getState());
            Thread.sleep(2000);
        }

        System.out.println(t.getState());


    }
}
