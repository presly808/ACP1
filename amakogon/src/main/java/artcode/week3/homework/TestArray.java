package artcode.week3.homework;

import java.util.Arrays;

/**
 * Created by amakogon on 26.06.2014.
 */
public class TestArray {
    public static void main(String[] args) throws InterruptedException {
        Integer[] mas = {7,3,5,4,1,3,10,2,-123};
//        Integer[] mas2 = {9,8,7,6,5,4,3,2,1,0};
//        mas = mas2;
        System.out.println(Arrays.toString(mas));
        ArraySorter<Integer> sorter = new ArraySorter<Integer>(mas,0,mas.length / 3);
        ArraySorter<Integer> sorter1 = new ArraySorter<Integer>(mas,mas.length / 3,(mas.length / 3) * 2);
        ArraySorter<Integer> sorter2 = new ArraySorter<Integer>(mas,(mas.length / 3) * 2,mas.length-1);
        ArraySorter<Integer> sorter3 = new ArraySorter<Integer>(mas,0,mas.length-1);
        Thread thread = new Thread(sorter);
        Thread thread1 = new Thread(sorter1);
        Thread thread2 = new Thread(sorter2);
        Thread thread3 = new Thread(sorter3);
        thread.start();
        thread1.start();
        thread2.start();
        boolean notReady = true;
        while (notReady){
            if(!thread.isAlive() && !thread1.isAlive() && !thread2.isAlive()){
                System.out.println(Arrays.toString(mas));
                thread3.start();
                notReady = false;
            }
        }


        thread3.join();
        System.out.println(Arrays.toString(mas));
        System.out.println(ArraySorter.getCounter());

    }
}
