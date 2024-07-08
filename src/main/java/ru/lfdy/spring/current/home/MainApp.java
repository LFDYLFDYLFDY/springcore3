package ru.lfdy.spring.current.home;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductService productService =  context.getBean("productService", ProductService.class);
        Cart cart = context.getBean("cart", Cart.class);
        OrderService orderService = context.getBean("orderService", OrderService.class);
        cart.add(productService.findProduct("product #1"));
        cart.add(productService.findProduct("product #3"));
        cart.add(productService.findProduct("product #5"));
        orderService.createOrderFromCurrentCart();
        ((AnnotationConfigApplicationContext) context).close();

    }
}
