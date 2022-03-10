package com.javarush.test;

public class Duck {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Утка по кличке " + this.name;
    }
}
