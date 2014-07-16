package ua.artcode.day2;

/**
 * Created by admin on 09.07.2014.
 */
public class Recursion {

    public static void action(int val){
        if(val == 10){
            return;
        }
        System.out.print(val + " ");
        action(val+1);
        System.out.println("after action");
    }


}
