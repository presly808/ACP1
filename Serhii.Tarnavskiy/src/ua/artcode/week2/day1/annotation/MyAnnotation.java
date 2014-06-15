package ua.artcode.week2.day1.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Тарнавський Сергій on 14.06.14.
 */
@Target(ElementType.TYPE)
@Retention(RUNTIME)
public @interface MyAnnotation {

    String name() default "";
    int age() default 0;

}
