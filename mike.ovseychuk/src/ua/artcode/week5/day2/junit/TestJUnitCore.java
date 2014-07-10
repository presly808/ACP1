package ua.artcode.week5.day2.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 * Created by mike on 7/6/14.
 */
public class TestJUnitCore {

        public static void main(String[] args) {
            JUnitCore jUnitCore = new JUnitCore();
            Result result = jUnitCore.run(TestMath.class);
            System.out.println( result.getFailures().toString() );
        }

    }



