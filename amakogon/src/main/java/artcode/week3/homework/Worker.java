package artcode.week3.homework;

/**
 * Created by amakogon on 26.06.2014.
 */
public class Worker implements Runnable {
    @Override
    public void run() {
        int i  = 1;
        while (i < 1000){

            System.out.println("run worker");
            i++;
        }
    }
}
