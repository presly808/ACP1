package ua.artcode.week5.day1.pattern_observer;

/**
 * Created by admin on 05.07.2014.
 */
public class Test {

    public static void main(String[] args) {
        CurrencyRate subject = new CurrencyRate();

        Observer privat = new PrivatObserver(subject);
        Observer aval = new AvalObserver(subject);

        subject.register(privat);
        subject.register(aval);

        subject.changeRate(45.123445);
    }


}
