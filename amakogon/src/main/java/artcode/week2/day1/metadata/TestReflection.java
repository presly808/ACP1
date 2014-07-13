package artcode.week2.day1.metadata;

import java.lang.reflect.Field;

/**
 * Created by amakogon on 14.06.2014.
 */
public class TestReflection {
    public static void main(String[] args) {
        User user = new User("Igor","pass");
        Class userClass = user.getClass();
        Field[] fields = userClass.getFields();
        System.out.println(fields.length);
        for(Field field : fields){
            System.out.println(field.getName());
        }
    }
}
