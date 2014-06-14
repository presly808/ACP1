package ua.artcode.week2.day1.proxy;

/**
 * Created by admin on 14.06.2014.
 */
public class Client {

    private IMath math;

    public Client(IMath math) {
        this.math = math;
    }

    public void action(){
        math.sum(12,12);
    }
}
