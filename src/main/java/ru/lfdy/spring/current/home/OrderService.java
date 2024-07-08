package ru.lfdy.spring.current.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {
    @Autowired
    Cart cart;
   public void createOrderFromCurrentCart() {
       System.out.println("Ваш заказ сформирован");
       List<Product> productList = cart.getContainer();
       for (Product p: productList) {
           System.out.println(p.getTitle());

       }
       System.out.println( "Обзая стоимость заказа: " +productList.stream().mapToInt(Product::getCost).sum());
   }
}
