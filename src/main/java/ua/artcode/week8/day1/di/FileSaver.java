package ua.artcode.week8.day1.di;

/**
 * Created by admin on 09.08.2014.
 */
public class FileSaver implements ISaver {
    @Override
    public void save() {
        System.out.println("file save");
    }
}
