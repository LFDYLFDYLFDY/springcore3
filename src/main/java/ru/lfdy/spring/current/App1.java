package ru.lfdy.spring.current;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Создаем контекст
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myContext.xml");
       SimpleBean simpleBeanbean1 = context.getBean("simpleBean", SimpleBean.class);
        simpleBeanbean1.doSomething();

       SimpleBean simpleBeanbean2 = context.getBean("simpleBean", SimpleBean.class);
       simpleBeanbean2.doSomething();
       simpleBeanbean2.setValue(101);
        simpleBeanbean1.doSomething();
        simpleBeanbean2.doSomething();

       CodeCreator codeCreator = context.getBean("javaCodeCreator", CodeCreator.class);
        System.out.println(codeCreator.getClassExample());
        CodeCreator cppCodeCreator = context.getBean("cppCodeCreator", CodeCreator.class);
        System.out.println(cppCodeCreator.getClassExample());

        context.close();
    }
}
