package ua.artcode.week3.homework.MergeSort;

import java.util.Arrays;

/**
 * Created by mike on 7/2/14.
 */
public class MergeTest
{
    public static void main(String[] args) throws InterruptedException {

        Integer[] a = {2, 1, 4, 0, 11, 45, 2, 1};
        MergeSort ms = new MergeSort();

        long start = System.currentTimeMillis();

        ms.sort(a);

        long result = System.currentTimeMillis() - start;

        System.out.println("res = " + Arrays.toString(a));
        System.out.println("time = " + result);

    }
}
