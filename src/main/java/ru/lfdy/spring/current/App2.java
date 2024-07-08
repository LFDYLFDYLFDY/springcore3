package ru.lfdy.spring.current;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
      ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
        SimpleBean simpleBean  =  context.getBean("simpleBean", SimpleBean.class);
simpleBean.doSomething();
        System.out.println("---------------------------------");
        simpleBean.setValue(10);
simpleBean.doSomething();
        //        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CodeCreator javaCC = context.getBean("javaCodeCreator", CodeCreator.class);
        System.out.println(javaCC.getClassExample());
        ((AnnotationConfigApplicationContext) context).close();


    }
}
