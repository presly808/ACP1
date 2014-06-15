package ua.artcode.week2.day1.proxy;

/**
 * Created by admin on 14.06.2014.
 */
public class ClientTest {
    public static void main(String[] args) {
        Client cl = new Client(new ProxyMath());
        cl.action();

    }
}
