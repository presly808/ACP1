package ua.artcode.week3.homework.MergeSort;

import java.util.Arrays;

/**
 * Created by mike on 7/2/14.
 */
public class MergeSort {

    private static Integer[] left;
    private static Integer[] right;
    private static Integer[] merge;

    public void sort(Integer[] data) throws InterruptedException {
        int mid = data.length / 2;
        int leftSize = mid;
        int rightSize = data.length - mid;

        left = new Integer [leftSize];
        right = new Integer [rightSize];
        merge = new Integer [data.length];

        System.arraycopy(data,0,left,0, leftSize);
        System.arraycopy(data,leftSize,right,0, rightSize);

        // InsertionSort.sort(left);
        // InsertionSort.sort(right);

        Runnable leftSort = new LeftSort();
        Runnable rightSort = new RightSort();

        Thread leftThread = new Thread(leftSort);
        Thread rightThread = new Thread(rightSort);

        leftThread.start();
        rightThread.start();

        leftThread.join();
        rightThread.join();

        System.out.println("left = " + Arrays.toString(left));
        System.out.println("right = " + Arrays.toString(right));

        int i = 0;
        int j = 0;
        int k = 0;

        while ( (i < mid ) && (j < mid) )
            data[k++] = (right[j] < left[i]) ? right[j++] : left[i++];

        while ( (i < mid) )
            data[k++] = right[i++];

        while ( (j < mid) )
            data[k++] = right[j++];

    }

    class LeftSort implements Runnable
    {
        @Override
        public void run() {
            InsertionSort.sort(left, "I'm the left");
        }
    }

    class RightSort implements Runnable
    {
        @Override
        public void run() {
            InsertionSort.sort(right, "I'm the right");
        }
    }

    public static class InsertionSort
    {
        public static void sort(Comparable[] mas, String message)
        {
            for (int i = 0; i < mas.length; i++) {
                for (int j=i; j > 0; j --){
                    if(mas[j].compareTo( mas [j-1]) < 0)  { Comparable temp = mas[j]; mas[j] = mas[j-1]; mas [j-1] = temp;  }
                }

                System.out.println(message);
            }
        }
    }

}
