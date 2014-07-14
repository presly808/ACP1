package ua.artcode.week2.day2.ReflectionFileHelper;

/**
 * Created by mike on 6/15/14.
 */
public class ClassReturnMaster {

    public Object Build(String[] strings) throws IllegalAccessException, InstantiationException {

        Object o = Object.class.newInstance();

        Class c = o.getClass();
        c.newInstance();
        



        return null;
    }
}
