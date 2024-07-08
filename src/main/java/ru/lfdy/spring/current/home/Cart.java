package ru.lfdy.spring.current.home;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {
    private List<Product> container;
    @PostConstruct
    public void init() {
        container = new ArrayList<Product>();
    }
    public void add(Product product) {
        container.add(product);
    }

    public List<Product> getContainer() {
        return container;
    }
}
