package ua.artcode.week1.test;

/**
 * Created by admin on 13.06.2014.
 */
public class MyMath implements ITest{


    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double minus(double a, double b) {
        return a - b;
    }
}
