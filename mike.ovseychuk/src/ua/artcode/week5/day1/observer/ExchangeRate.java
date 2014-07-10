package ua.artcode.week5.day1.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mike on 7/5/14.
 */
public class ExchangeRate implements Subject {

    private int rate;


    private List<Observer> observerList = new LinkedList<Observer>();


    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {

        for (Observer observer: observerList)
        {
            observer.update();

        }
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }



}
