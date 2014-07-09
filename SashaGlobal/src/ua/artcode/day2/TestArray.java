package ua.artcode.day2;

import ua.artcode.day1.ArrayUtil;
import ua.artcode.day1.Employee;

/**
 * Created by admin on 09.07.2014.
 */
public class TestArray {
    public static void main(String[] args) {

        /**
         * TODO : @see System , Wrappers(Integer, Double ...)
         *
         *
         *
         * */


        Array array = new Array(5);

        for(int i = 0; i < 10; i++){
            array.insert(i);
        }

        array.printArr();

    }

}
