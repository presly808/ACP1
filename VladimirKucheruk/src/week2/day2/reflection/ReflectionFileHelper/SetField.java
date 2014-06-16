package week2.day2.reflection.ReflectionFileHelper;

import java.lang.reflect.Field;

/**
 * Created by vkucheru on 15.06.2014.
 */
public class SetField {

    private SetField() {
    }

    private static String getAccessModifier(String str) {
        return str.split(" ")[0].trim();
    }

    private static String getFieldType(String str) {
        return str.split(" ")[1].trim();
    }

    private static String getFieldName(String str) {
        return str.split(" ")[2].trim();
    }

    private static String getFieldValue(String str) {
        return str.split("=")[1].trim();
    }

    public static boolean set(Object obj, String str) throws NoSuchFieldException, IllegalAccessException {
        String fieldName = getFieldName(str);
        String fieldType = getFieldType(str);
        String fieldValue = getFieldValue(str);
        Field f = obj.getClass().getDeclaredField(fieldName);
        f.setAccessible(true);
        if ("java.lang.String".equals(fieldType)) { f.set(obj, fieldValue); return true; }
        if ("boolean".equals(fieldType)) { f.setBoolean(obj, Boolean.valueOf(fieldValue)); return true; }
        if ("byte".equals(fieldType)) { f.setByte(obj, Byte.valueOf(fieldValue)); return true; }
        if ("char".equals(fieldType)) { f.setChar(obj, fieldValue.charAt(0)); return true; }
        if ("double".equals(fieldType)) { f.setDouble(obj, Double.valueOf(fieldValue)); return true; }
        if ("float".equals(fieldType)) { f.setFloat(obj, Float.valueOf(fieldValue)); return true; }
        if ("int".equals(fieldType)) { f.setInt(obj, Integer.valueOf(fieldValue)); return true; }
        if ("Long".equals(fieldType)) { f.setLong(obj, Long.valueOf(fieldValue)); return true; }
        if ("short".equals(fieldType)) { f.setShort(obj, Short.valueOf(fieldValue)); return true; }
        return false;
    }


}
