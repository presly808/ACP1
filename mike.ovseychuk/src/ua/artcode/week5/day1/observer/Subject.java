package ua.artcode.week5.day1.observer;

/**
 * Created by mike on 7/5/14.
 */
public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAllObservers();
}
