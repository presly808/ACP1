package ua.artcode.day1;

/**
 * Fields - state
 * Methods - actions, behavior
 * Code convention Java
 *
 */
public class ArrayUtil {


    /*
    * Input and output
    * */
    public static void printArr(int[] mas){
        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    //must be return statement
    public static int[] createRandomArr(int size){
        int[] mas = new int[size];// default values

        // begin cond, exit cond, step cond,
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random() * 100);
        }
        return mas;
    }

    //
    public static void showMinMax(int[] mas){
        int min = mas[0];
        int max = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if(min > mas[i])
                min = mas[i];

            if(max < mas[i])
                max = mas[i];
        }
        System.out.println("max = " + max + ", min = " + min);
    }

}
