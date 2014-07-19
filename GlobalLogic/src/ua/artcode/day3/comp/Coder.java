package ua.artcode.day3.comp;

/**
 * Created by admin on 15.07.2014.
 */
public class Coder extends Worker {

    private String position;
    private int experience;

    public Coder(String name, int age, double salary, String position, int experience) {
        super(name, age, salary);
        this.position = position;
        this.experience = experience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public void work(){
        System.out.println("Coder is working");
    }
}
