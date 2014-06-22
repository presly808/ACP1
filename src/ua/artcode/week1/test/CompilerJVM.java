package ua.artcode.week1.test;

import javax.tools.JavaCompiler;
import javax.tools.Tool;
import javax.tools.ToolProvider;
import java.io.File;

/**
 * Created by admin on 13.06.2014.
 */
public class CompilerJVM {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        JavaCompiler jc = ToolProvider.getSystemJavaCompiler();

        int i = jc.run(null, null, null, "src/ua/artcode/week1/test/MyMath.java");
        if(i == 0){
            System.out.println("Success");
        }
        Class<MyMath> mathClass = (Class<MyMath>) Class.forName("ua.artcode.week1.test.MyMath");

        test(mathClass);


    }

    public static void test(Class<? extends ITest> clazz) throws IllegalAccessException, InstantiationException {
        ITest iTest = clazz.newInstance();
        if(iTest.minus(20,10) == 10) {
            System.out.println("1st success");
        }

        if (iTest.sum(20,10) == 30){
            System.out.println("2nd success");
        }
    }
}
