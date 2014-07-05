package ua.artcode.week5.day1.pattern_observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by admin on 05.07.2014.
 */
public class CurrencyRate implements Subject {

    private List<Observer> observerList = new LinkedList<>();

    private double rate = 20;

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer ob : observerList){
            ob.update();
        }
    }

    public double getRate() {
        return rate;
    }

    public void changeRate(double rate) {
        this.rate = rate;
        notifyAllObservers();
    }
}
