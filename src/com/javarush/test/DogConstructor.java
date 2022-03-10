package com.javarush.test;

public class DogConstructor {
    private String name;
    private int age;
    private String color;
    public DogConstructor(String _name){
        this.name = _name;
    }
    public DogConstructor(String _name, int _age){
        this.name = _name;
        this.age = _age;
    }
    public DogConstructor(String _name, int _age, String _color){
        this.name = _name;
        this.age = _age;
        this.color = _color;
    }

    @Override
    public String toString() {
        return "Собака{" +
                "кличка='" + name + '\'' +
                ", возраст=" + age +
                ", цвет='" + color + '\'' +
                '}';
    }
}
