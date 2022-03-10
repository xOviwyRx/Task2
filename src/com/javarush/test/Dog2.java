package com.javarush.test;

public class Dog2 {
    private String name;
    private int age;
    private String color;
    public void initialize(String _name){
        this.name = _name;
    }
    public void initialize(String _name, int _age){
        this.name = _name;
        this.age = _age;
    }
    public void initialize(String _name, int _age, String _color){
        this.name = _name;
        this.age = _age;
        this.color = _color;
    }
}
