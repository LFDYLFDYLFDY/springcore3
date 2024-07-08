package ru.lfdy.spring.current;

public class AnimalsClassNameGenerator implements ClassNameGenerator{
    public String generateClassName() {
        String[] names= {"Cat","Dog","Fish","Horse"};
        return names[(int)(Math.random()*names.length)];

    }
}
