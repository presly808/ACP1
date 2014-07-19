package artcode.week5.day1.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by amakogon on 05.07.2014.
 */
public class BabloSubject  implements MySubject{

    private List<MyObserver> observers;

    private int course;

    public BabloSubject() {
        observers = new LinkedList<MyObserver>();
    }

    @Override
    public void registerObserver(MyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(MyObserver observer : observers){
            observer.update();
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
        notifyObservers();
    }
}
