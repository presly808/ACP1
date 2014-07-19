package ua.artcode.week3.day2.threads;

/**
 * Created by admin on 22.06.2014.
 */
public class SeparateAction implements Runnable {

    private String name;

    public SeparateAction(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int i = 0;
        while(++i < 7){
            System.out.println("NewThread" + name);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
