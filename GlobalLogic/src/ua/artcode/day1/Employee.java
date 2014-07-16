package ua.artcode.day1;

/**
 * Fields and methods
 * class = Template
 * architect
 */
public class Employee {

    private String name; // for reference -> null
    private int age; // 0
    private double salary; // 0.0
    Employee mentor; //package - private

    public Employee(){

    }

    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //depends on instance
    public void sayHello(){
        System.out.println("Hello, my name is " + name + " age " + age + " salary " + salary);
    }

}
