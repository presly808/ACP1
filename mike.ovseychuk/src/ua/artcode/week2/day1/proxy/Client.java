package ua.artcode.week2.day1.proxy;

/**
 * Created by mike on 6/14/14.
 */
public class Client
{
    public static void main(String[] args) {
        IMath math = new ProxyMath();
        math.sum(2, 2);
    }
}
