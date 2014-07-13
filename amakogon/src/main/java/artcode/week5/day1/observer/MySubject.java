package main.java.artcode.week5.day1.observer;

/**
 * Created by amakogon on 05.07.2014.
 */
public interface MySubject {
    void registerObserver(MyObserver observer);
    void removeObserver(MyObserver observer);
    void notifyObservers();
}
