package ua.artcode.week7.day1;

import java.math.BigInteger;

/**
 * Created by admin on 19.07.2014.
 */
public class FactorialTask {

    public static BigInteger fact(int num){
        BigInteger res = new BigInteger(String.valueOf(num));
        for(; num > 1; num--){
            res = res.multiply(new BigInteger(String.valueOf(num)));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fact(1000000));
    }
}
