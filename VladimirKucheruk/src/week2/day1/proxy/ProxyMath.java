package week2.day1.proxy;

/**
 * Created by vkucheru on 14.06.2014.
 */
public class ProxyMath implements IMath {

    private ConcreteMath concreteMath = new ConcreteMath();

    @Override
    public int sum(int a, int b) {
        if (a<0 || b<0) {
            System.out.println("a<0 or b<0");
            return -1;
        }
        else return concreteMath.sum(a,b);
    }

    @Override
    public int minus(int a, int b) {
        if (a<b) {
            System.out.println("a<b");
            return -1;
        }
        else return concreteMath.minus(a,b);
    }
}
