package ua.artcode.week8.day1.di;

/**
 * Created by admin on 09.08.2014.
 */
public class A {

    @ForInject
    private ISaver saver;

    public A() {
    }

    public void test(){
        saver.save();
    }

}
