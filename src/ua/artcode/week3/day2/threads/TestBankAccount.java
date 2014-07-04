package ua.artcode.week3.day2.threads;

/**
 * Created by admin on 22.06.2014.
 */
public class TestBankAccount {
    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount();

        Thread t = new Thread(new BankThread(account));
        Thread t1 = new Thread(new BankThread(account));

        t1.start();
        t.start();


        t1.join();
        t.join();

        System.out.println(account);

    }
}
