package ua.artcode.week2.day2.ReflectionFileHelper;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by amakogon on 15.06.2014.
 */
public class ClassInfoImpl implements IClassInfo {
    @Override
    public String getClass(Object o) {
        Class oClass = o.getClass();
        return oClass.getName();
    }

    @Override
    public String[] getFieldInfo(Object o) {
        Class oClass = o.getClass();
        Field[] fields = oClass.getDeclaredFields();
        String[] stringFileds = new String[fields.length];
        for(int i = 0; i < fields.length; i++){
            int mod = fields[i].getModifiers();

            try {
                fields[i].setAccessible(true);
                stringFileds[i] = Modifier.toString(mod) + " " + fields[i].getType().getSimpleName() + " " + fields[i].getName() + "=" + fields[i].get(o);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return stringFileds;
    }
}
