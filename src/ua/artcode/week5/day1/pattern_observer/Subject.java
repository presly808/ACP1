package ua.artcode.week5.day1.pattern_observer;

/**
 * Created by admin on 05.07.2014.
 */
public interface Subject {

    void register(Observer observer);
    void deleteObserver(Observer observer);
    void notifyAllObservers();


}
