package week2.day2.reflection.ReflectionFileHelper;

/**
 * Created by mike on 6/15/14.
 */
public interface IClassInfo {

    String getClass(Object o);
    String [] getFieldInfo(Object o) throws IllegalAccessException;
}
