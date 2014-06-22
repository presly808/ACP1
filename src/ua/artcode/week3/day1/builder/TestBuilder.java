package ua.artcode.week3.day1.builder;

/**
 * Created by admin on 21.06.2014.
 */
public class TestBuilder {
    public static void main(String[] args) throws NoSuchFieldException {
        Human.HumanBuilder builder = new Human.HumanBuilder();
        Human h = builder.addAbout("some info").addAge(22).addName("Kolia").build();
        System.out.println(h);
    }
}
