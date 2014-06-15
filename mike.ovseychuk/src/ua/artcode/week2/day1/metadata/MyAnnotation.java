package ua.artcode.week2.day1.metadata;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by mike on 6/14/14.
 */

// метоанатоція - анатація над анотацією
//  @Retention(RetentionPolicy.SOURCE)  - доступ тільки в сорс коді
//  @Retention(RetentionPolicy.CLASS)   - в класі
//  @Retention(RetentionPolicy.RUNTIME) - в jvm

@Retention(RetentionPolicy.CLASS)    //де буде діяти
@Target(ElementType.TYPE)          //до чого буде задіяна
public @interface MyAnnotation {

    //все public
    //аналогія поля з методом
    //тільки примітивні і imutable, enum

    String login() default "";
    int pass() default 0;
}
