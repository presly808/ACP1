package ua.artcode;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

/**
 * Created by admin on 03.07.2014.
 */
public class TestFileUtil {

    @Test
    public void testSum(){
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("e:/dev/test.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int res = InputUtil.action(45, 12);
        Assert.assertEquals("result", 17, res);
    }

}
