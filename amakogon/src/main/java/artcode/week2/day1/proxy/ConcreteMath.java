package artcode.week2.day1.proxy;

/**
 * Created by amakogon on 14.06.2014.
 */
public class ConcreteMath implements IMath {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }
}
