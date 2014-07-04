package ua.artcode.week3.day2.threads;

/**
 * Created by admin on 22.06.2014.
 */
public class WorkerThread extends Thread {

    private String name;
    private int chain;

    public WorkerThread(int chain, String name) {
        this.chain = chain;
        this.name = name;
    }

    @Override
    public void run() {
        if(chain != 0){
            new WorkerThread(chain - 1, chain + "").start();
        }

        for(int i = 0 ; i < 5; i++){
            System.out.println(this);
            sleepWrapper(1000);
        }
    }

    private void sleepWrapper(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "WorkerThread{" +
                "name='" + name + '\'' +
                '}';
    }
}
