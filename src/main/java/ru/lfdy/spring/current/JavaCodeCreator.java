package ru.lfdy.spring.current;

public class JavaCodeCreator implements CodeCreator{
    ClassNameGenerator classNameGenerator;


    @Override
    public String getClassExample() {
        return "public class "+classNameGenerator.generateClassName() +"{\n\n}";
    }

    public void setClassNameGenerator(ClassNameGenerator classNameGenerator) {
        this.classNameGenerator = classNameGenerator;
    }
}
