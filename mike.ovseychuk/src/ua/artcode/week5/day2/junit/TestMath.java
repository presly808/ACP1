package ua.artcode.week5.day2.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mike on 7/6/14.
 */
public class TestMath {

    int a = 78;
    int b = 12;

    @Before                                                 //запускать перед кожним методом
    public void before() {

        a = ( (int)Math.random() * 1000 );
    }

    @Before                                                 //запускать после кожного метода
    public void after() {

        b = ( (int)Math.random() * 500 );
    }



    @Test                                                   // JUnit annotation
    public void testersRandom(){

        Double actual = Math.random();

        Assert.assertNotEquals(-1 , actual);                // JUnit class (-1 != actual) для проверок
        Assert.assertNotEquals(0 , actual);                 // JUnit class (0 != actual)

        //Assert.assertEquals(10, actual);

        Assert.assertSame(Double.class, actual.getClass());
    }


    @Test (expected = ArithmeticException.class)            //має викинути ексепшн
    public void testDiv()
    {
        int i = 67 / 0;
    }

    @Test (timeout = 1000)                                  // час виконання метода
    public void testTime()
    {
        int i = 67;
    }







}
