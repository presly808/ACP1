package ua.artcode.week3.day2.threads;

/**
 * Created by admin on 22.06.2014.
 */
public class BankAccount {

    private int amount;

    public synchronized void addToAmount(int i){
        amount += i;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "amount=" + amount +
                '}';
    }
}
