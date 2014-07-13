package ua.artcode.week4.day1;

/**
 * Created by mike on 6/28/14.
 */
public class BankAccount {

    private int value;
    private final int LIMIT = 1000;
    private Object lock = new Object();



    public void get(int money) throws InterruptedException {
        synchronized (lock){
            System.out.println(Thread.currentThread().getName());
            while (value < LIMIT)
            {
                this.wait();        //чекає, звільняє ключ
            }
            value -= money;
            this.notifyAll();;
        }
    }

    public void put(int money) throws InterruptedException {
        synchronized (lock){
            System.out.println(Thread.currentThread().getName());
            while ( value > LIMIT)
            {
                this.wait();
            }
            value += money;
            this.notifyAll();
        }
    }

}