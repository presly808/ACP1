package artcode.week4.homework.skype;

/**
 * Created by amakogon on 01.07.2014.
 */
public interface Subject {
    void registerClient(Observer o);
    void removeClient(Observer o);
    void notifyObservers();

}
