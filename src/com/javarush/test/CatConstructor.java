package com.javarush.test;

public class CatConstructor {
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;
    public CatConstructor(String _name){
        this.name = _name;
    }
    public CatConstructor(String _name, int _weight, int _age){
        this.name = _name;
        this.weight = _weight;
        this.age = _age;
    }
    public CatConstructor(String _name, int _age){
        this.name = _name;
        this.weight = 2;
        this.age = _age;
    }
    public CatConstructor(int _weight, String _color){
        this.weight = _weight;
        this.color = _color;
    }
    public CatConstructor(int _weight, String _color, String _address){
        this.weight = _weight;
        this.color = _color;
        this.address = _address;
    }

    @Override
    public String toString() {
        return "Кошка {" +
                "кличка='" + name + '\'' +
                ", вес=" + weight +
                ", возраст=" + age +
                ", цвет='" + color + '\'' +
                ", адрес='" + address + '\'' +
                '}';
    }
}
