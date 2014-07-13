package ua.artcode.week5.day2.unit_te;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by admin on 06.07.2014.
 */
public class TestMath {

    int a = 78;
    int b = 22;

    @Before
    public void before(){
        a = (int)(Math.random() * 100);
        b = (int)(Math.random() * 100);
    }

    @Test
    public void testRandom(){
        Double actual = Math.random();

        Assert.assertEquals(10, actual, 1);
        Assert.assertSame(Double.class, actual.getClass());
    }

    @Test(expected = ArithmeticException.class)
    public void testPow(){
        int i = 67 / 0;
    }




}
