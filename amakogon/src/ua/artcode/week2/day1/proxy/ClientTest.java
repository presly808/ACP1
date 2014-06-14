package ua.artcode.week2.day1.proxy;

/**
 * Created by amakogon on 14.06.2014.
 */
public class ClientTest {
    public static void main(String[] args) {
        IMath math = new ProxyMath();
        int result = math.sum(1,-1);
        System.out.println(result);
    }
}
