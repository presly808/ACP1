package artcode.week2.day2.reflection;

import artcode.week2.day1.metadata.MyAnnotation;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amakogon on 15.06.2014.
 */
public class ClassInfoImpl implements IClassInfo {
    @Override
    public String getClassName(Object o) {
        Class oClass = o.getClass();
        return oClass.getName();
    }

    @Override
    public String[] getFieldInfo(Object o) {
        Class oClass = o.getClass();
        Field[] fields = oClass.getDeclaredFields();
        List<Field> fields1 = new ArrayList<Field>(0);
        for (Field f : fields) {
            if (f.isAnnotationPresent(MyAnnotation.class)) {
                fields1.add(f);
            }
        }
        String[] stringFileds = new String[fields.length];
        for (int i = 0; i < fields1.size(); i++) {
            int mod = fields1.get(i).getModifiers();

            try {
                fields1.get(i).setAccessible(true);
                stringFileds[i] = Modifier.toString(mod) + " " + fields1.get(i).getType().getSimpleName() + " " + fields1.get(i).getName() + "=" + fields1.get(i).get(o);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return stringFileds;
    }
}
