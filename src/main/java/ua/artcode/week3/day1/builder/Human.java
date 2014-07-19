package ua.artcode.week3.day1.builder;

import ua.artcode.week2.day1.metadata.MyAnnotation;

/**
 * Created by admin on 21.06.2014.
 */
public class Human {

    private final String name;
    private final int age;
    private final String about;

    public Human(String name, int age, String about) {
        this.name = name;
        this.age = age;
        this.about = about;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", about='" + about + '\'' +
                '}';
    }

    public static class HumanBuilder {

        private String name;
        private int age;
        private String about;

        public HumanBuilder addName(String name){
            this.name = name;
            return this;
        }

        public HumanBuilder addAge(int age){
            this.age = age;
            return this;
        }

        public HumanBuilder addAbout(String about){
            this.about = about;
            return this;
        }

        public Human build() throws NoSuchFieldException {
            return new Human(name,age,about);
        }

    }
}
