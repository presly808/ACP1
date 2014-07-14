package ua.artcode.week5.day1.observer;

/**
 * Created by mike on 7/5/14.
 */
public class BankAval implements Observer {

    private int dollars;
    private ExchangeRate exchangeRate;


    public BankAval(int dollars) {
        this.dollars = dollars;
    }

    @Override
    public void update() {
        System.out.println();
    }


}
