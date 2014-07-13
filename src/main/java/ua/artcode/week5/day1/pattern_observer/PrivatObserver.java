package ua.artcode.week5.day1.pattern_observer;

/**
 * Created by admin on 05.07.2014.
 */
public class PrivatObserver implements Observer {

    private CurrencyRate rate;

    public PrivatObserver(CurrencyRate rate) {
        this.rate = rate;
    }

    @Override
    public void update() {
        System.out.printf("Privat %.1f\n", rate.getRate());
    }


}
