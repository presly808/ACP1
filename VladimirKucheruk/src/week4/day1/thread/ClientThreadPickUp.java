package week4.day1.thread;

/**
 * Created by vkucheru on 28.06.2014.
 */
public class ClientThreadPickUp implements Runnable {

    private BankAccount bankAccount;
    private int amount;

    public ClientThreadPickUp(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        if (bankAccount.get()>=amount) bankAccount.pickUp(amount);
    }
}
