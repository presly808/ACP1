package week2.day2.reflection.ReflectionFileHelper;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by okohanch on 15.06.2014.
 */
public class ClassInfo implements IClassInfo {

    @Override
    public String getClass(Object o) {
        Class cl = o.getClass();
        return cl.getName();
    }

    @Override
    public String [] getFieldInfo(Object o) throws IllegalAccessException {
        int index = 0;
        Class cl = o.getClass();
        Field[] declaredFields = cl.getDeclaredFields();
        String[] array = new String[declaredFields.length];

        for (Field f : declaredFields) {
            int id = f.getModifiers();
            String idName = Modifier.toString(id);
            Class<?> type = f.getType();
            String fieldTypeName = type.getName();
            String fieldName = f.getName();
            f.setAccessible(true);
            Object value = f.get(o);
            String field = generateString(idName, fieldTypeName, fieldName, value);
            array[index] = field;
            index++;


        }
        return array;
    }
        private String generateString(String idName, String fieldTypeName, String fieldName , Object o){
        return idName + " " + fieldTypeName + " " + fieldName + " = " + o.toString();
    }
}
