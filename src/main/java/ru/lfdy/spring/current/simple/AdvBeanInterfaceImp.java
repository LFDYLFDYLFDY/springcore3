package ru.lfdy.spring.current.simple;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AdvBeanInterfaceImp  implements BeanInterface{

   @Override
    public void doSomething() {
        System.out.println(2);
    }
}
