package com.javarush.test;

public class Cat2 {
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;
    public void initialize(String _name){
        this.name = _name;
    }
    public void initialize(String _name, int _weight, int _age){
        this.name = _name;
        this.weight = _weight;
        this.age = _age;
    }
    public void initialize(String _name, int _age){
        this.name = _name;
        this.weight = 2;
        this.age = _age;
    }
    public void initialize(int _weight, String _color){
        this.weight = _weight;
        this.color = _color;
    }
    public void initialize(int _weight, String _color, String _address){
        this.weight = _weight;
        this.color = _color;
        this.address = _address;
    }
}
