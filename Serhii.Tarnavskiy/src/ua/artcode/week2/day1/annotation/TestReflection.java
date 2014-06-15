package ua.artcode.week2.day1.annotation;
import java.lang.reflect.Field;
/**
 * Created by Тарнавський Сергій on 14.06.14.
 */
public class TestReflection {
    public static void main(String[] args) throws IllegalAccessException {
        User u = new User("Igor", "pass");
        Class userClass = u.getClass();
        int[] mas = new int[5];
        System.out.println(mas.getClass().isArray());

        Field[] fields = userClass.getDeclaredFields();

        for(Field f : fields) {
            f.setAccessible(true);
            f.set(u, "new");
            System.out.println(f.getName());
        }
        System.out.println(u);
    }
}
