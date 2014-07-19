package ua.artcode.week5.day1.pattern_observer;

/**
 * Created by admin on 05.07.2014.
 */
public class AvalObserver implements Observer {

    private CurrencyRate rate;

    public AvalObserver(CurrencyRate rate) {
        this.rate = rate;
    }

    @Override
    public void update() {
        System.out.printf("Aval %.4f\n", rate.getRate());
    }
}


