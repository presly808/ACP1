package ua.artcode.week2.day1.proxy;

/**
 * Created by admin on 14.06.2014.
 */
public class ProxyMath implements IMath {

    private ConcreteMath concreteMath = new ConcreteMath();

    @Override
    public int sum(int a, int b) {
        if(a < 0 && b < 0) {
            System.out.println("can not add");
            return -1;
        }
        return concreteMath.sum(a, b);
    }

    @Override
    public int minus(int a, int b) {
        if(a < 0 && b < 0) {
            System.out.println("can not add");
            return -1;
        }
        return concreteMath.minus(a, b);
    }


}
