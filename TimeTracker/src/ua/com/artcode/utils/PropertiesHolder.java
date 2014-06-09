package ua.com.artcode.utils;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by admin on 09.06.2014.
 */
//TODO: wrap class java.util.Properties for implement PropertyHolder
public class PropertiesHolder implements IPropertiesHolder {


    @Override
    public String getValue(String key) {
        return null;
    }

    @Override
    public boolean containsValue(String key) {
        return false;
    }

    @Override
    public Map<String, String> allProperties() {
        return null;
    }

    @Override
    public Set<String> allKeys() {
        return null;
    }


}
