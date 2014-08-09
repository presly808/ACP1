package ua.artcode.week8.day1.di;

import java.lang.reflect.Field;
import java.util.Properties;

/**
 * Created by admin on 09.08.2014.
 */
public class DependencyInjector {

    private Properties properties = new Properties();

    public DependencyInjector() {
        initProp();
    }

    public void process(Object o) {

        Field[] fields = o.getClass().getDeclaredFields();
        for (Field f : fields) {
            if (f.isAnnotationPresent(ForInject.class)) {
                f.setAccessible(true);
                try {
                    String keyClassName = properties.getProperty(f.getType().getCanonicalName());
                    Object value = Class.forName(keyClassName).newInstance();
                    f.set(o, value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }

    }

    private void initProp(){
        properties.setProperty("ua.artcode.week8.day1.di.ISaver",
                                "ua.artcode.week8.day1.di.FileSaver");
    }
    // ua.artcode.week8.day1.di.ISaver=ua.artcode.week8.day1.di.FileSaver


}
