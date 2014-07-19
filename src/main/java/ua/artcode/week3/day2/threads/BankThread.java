package ua.artcode.week3.day2.threads;

/**
 * Created by admin on 22.06.2014.
 */
public class BankThread implements Runnable {

    private BankAccount account;

    public BankThread(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            account.addToAmount(1);
        }
    }
}
