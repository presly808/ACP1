package ua.artcode.week3.day1;

/**
 * Created by admin on 21.06.2014.
 */
public class TestImmut {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("");


        for(int i = 0; i < 10_000; i++){
            sb.append(i);
        }



        System.out.println(sb.toString());
    }
}
