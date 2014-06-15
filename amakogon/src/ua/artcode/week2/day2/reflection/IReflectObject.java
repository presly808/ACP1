package ua.artcode.week2.day2.reflection;

import java.util.List;

/**
 * Created by amakogon on 15.06.2014.
 */
public interface IReflectObject {

    List<String[]> getObjectData(String[] info);

    Object instantiate(String[] objectInfo) throws ClassNotFoundException, IllegalAccessException, InstantiationException;

    void setFields(String[] objectInfo, Object obj) throws IllegalAccessException;
}
