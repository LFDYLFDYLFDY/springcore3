package ru.lfdy.spring.current.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig .class);

   ShopService shopService = (ShopService) context.getBean("shopService");
        shopService.buy();
        ((AnnotationConfigApplicationContext) context).close();


    }
}
