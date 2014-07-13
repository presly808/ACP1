package artcode.week2.day2.reflection;

/**
 * Created by amakogon on 15.06.2014.
 */
public interface IClassInfo {
    String getClassName(Object o);

    String[] getFieldInfo(Object o);
}
