package ru.lfdy.spring.current;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3 {

public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
//            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
//    SimpleBean simpleBean  =  context.getBean("simpleBean", SimpleBean.class);
//simpleBean.doSomething();
//        System.out.println("---------------------------------");
    AnnotatedBean annotatedBean = context.getBean("annotatedBean", AnnotatedBean.class);
    annotatedBean.example();
    ((AnnotationConfigApplicationContext) context).close();


}
}
