package ua.artcode.day1;

/**
 * Use class, create instance
 */
public class TestEmployee {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Vova");

        employee1.sayHello();

        Employee employee2 = new Employee("Andrey", 27, 1500);
        employee2.sayHello();


    }

}
