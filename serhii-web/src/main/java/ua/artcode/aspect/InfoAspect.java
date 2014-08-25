package ua.artcode.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by admin on 22.08.2014.
 */
public class InfoAspect {


    public Object infoAroundAdvice(ProceedingJoinPoint point) throws Throwable {
        System.out.println("Advice before processing");
        System.out.println(point.getSignature().toShortString());
        try{
            return point.proceed();
        } finally {
            System.out.println("Advice after processing");
        }
    }

}
