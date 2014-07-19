package ua.artcode.day1;

import java.util.Scanner;

/**
 * Created by admin on 08.07.2014.
 */
public class TestArrayUtil {

    //psvm JVM ask about main, where is begin

    //
    /*
    * Primitive
    * byte, short, int, long, float, double, char, boolean
    *
    * Scanner, String, int[] - Reference
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of arr");
        int size = sc.nextInt();
        int[] res = ArrayUtil.createRandomArr(size);
        ArrayUtil.printArr(res);
        ArrayUtil.showMinMax(res);




    }
}
