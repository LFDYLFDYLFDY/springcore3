package ru.lfdy.spring.current;


public class SimpleBean {
    private int value;
    public void doSomething() {
        System.out.println("Simple Bean print =   "+ value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
