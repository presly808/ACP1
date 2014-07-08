package ua.artcode.day1;

/**
 * Use class, create instance
 */
public class TestEmployee {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Anton";
        employee1.age = 25;
        employee1.salary = 2000;
        employee1.sayHello();

        Employee employee2 = new Employee();
        employee2.name = "Andrey";
        employee2.age = 27;
        employee2.salary = 1500;
        employee2.sayHello();

        employee1.mentor = employee2;
    }

}
