package main.java.artcode.week4.day1;

/**
 * Created by amakogon on 28.06.2014.
 */
public class BankAccount {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public synchronized void put(int money){
        amount += money;
    }
}
