package ru.lfdy.spring.current.simple;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void createOrder() {
        System.out.println("Заказ создан");
    }
}
