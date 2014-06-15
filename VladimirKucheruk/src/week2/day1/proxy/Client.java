package week2.day1.proxy;

/**
 * Created by vkucheru on 14.06.2014.
 */
public class Client {
    public static void main(String[] args) {
        IMath proxyMath = new ProxyMath();
        proxyMath.sum(-1, -1);
    }
}
