package ua.artcode.week5.day2.unit_te;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 * Created by admin on 06.07.2014.
 */
public class TestJUnitRunner {


    public static void main(String[] args) {
        JUnitCore jUnitCore = new JUnitCore();
        Result result = jUnitCore.run(TestMath.class);
        System.out.println(result.wasSuccessful());
    }
}
