package ru.lfdy.spring.current.home;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;

import javax.annotation.PostConstruct;

@Component
public class ProductService {
    private List<Product> products;

   @PostConstruct
    public void init(){
        products = new ArrayList<Product>();
      for (int i = 0; i < 10; i++) {
          products.add(new Product(new Long(i+1), "product #"+(i+1), 10*(i+1)));

      }
        System.out.println(products);

    }

    public Product findProduct(String title){
        return products.stream().filter(p -> p.getTitle().equals(title)).findFirst().get();
    }
    public void print(){
        products.forEach(System.out::println);
    }
}
