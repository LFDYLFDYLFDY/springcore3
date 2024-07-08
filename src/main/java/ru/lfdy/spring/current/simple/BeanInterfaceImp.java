package ru.lfdy.spring.current.simple;

import org.springframework.stereotype.Component;

@Component
public class BeanInterfaceImp implements BeanInterface{

    @Override
    public void doSomething() {
        System.out.println(1);
    }
}
