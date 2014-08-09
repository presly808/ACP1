package ua.artcode.week8.day1.di;

/**
 * Created by admin on 09.08.2014.
 */
public class Test {

    public static void main(String[] args) {
        DependencyInjector di = new DependencyInjector();
        A a = new A();
        di.process(a);
        a.test();
    }
}
