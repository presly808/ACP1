package main.java.artcode.week5.day2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amakogon on 06.07.2014.
 */
public class TestMath {
    @Test
    public void testRandom(){
        Double actual = Math.random();

        Assert.assertNotEquals(-1, actual);

        Assert.assertSame(Double.class, actual.getClass());
    }
}
