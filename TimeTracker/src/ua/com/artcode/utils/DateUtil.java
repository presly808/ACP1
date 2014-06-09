package ua.com.artcode.utils;

import java.util.Date;

/**
 * Created by admin on 09.06.2014.
 */
public class DateUtil {

    public static String format(Date date) {
        return date != null ? String.format("%1$td/%1$tm/%1$ty %1$tH:%1$tM", date) : "date is not set";
    }

}
