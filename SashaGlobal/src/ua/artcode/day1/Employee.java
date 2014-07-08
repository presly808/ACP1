package ua.artcode.day1;

/**
 * Fields and methods
 * class = Template
 * architect
 */
public class Employee {

    String name; // for reference -> null
    int age; // 0
    double salary; // 0.0
    Employee mentor;

    //depends on instance
    public void sayHello(){
        System.out.println("Hello, my name is " + name + " age " + age + " salary " + salary);
    }

}
