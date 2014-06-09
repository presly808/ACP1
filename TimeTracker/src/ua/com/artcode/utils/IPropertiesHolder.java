package ua.com.artcode.utils;

import sun.awt.SunHints;

import java.util.Map;
import java.util.Set;

/**
 * Created by admin on 09.06.2014.
 */
public interface IPropertiesHolder {

    String getValue(String key);

    boolean containsValue(String key);

    Map<String, String> allProperties();

    Set<String> allKeys();

}
