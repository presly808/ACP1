package main.java.artcode.week3.day1;

/**
 * Created by amakogon on 21.06.2014.
 */
public class TestAlg {

    public TestAlg() {
    }

    public static void main(String[] args) {
        long a =System.currentTimeMillis();
//        String s = "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
//            s += i;
            builder.append(i);
        }
        builder.toString();

        System.out.println(a - System.currentTimeMillis());
    }
}
