package main.java.artcode.week3.homework;

/**
 * Created by amakogon on 26.06.2014.
 */
public class ArraySorter<T extends Comparable> implements Runnable {

    private T[] array;
    private int start;
    private int end;
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    public ArraySorter(T[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public void run() {
        partSort(array,start,end);
    }

    public void partSort(T[] array, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start " + start + " less then end " + end);
        }
        for (int i = start; i < end; i++) {
            for (int j = start; j < end ; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
                counter++;
            }
        }
    }
//{7,3,5,4,1,3,10,2}
    private void swap(T[] array, int first, int second) {
        T temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }


}
