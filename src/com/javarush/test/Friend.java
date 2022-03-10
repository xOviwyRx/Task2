package com.javarush.test;

public class Friend {
    private String name;
    private int age;
    private String sex;
    public void initialize(String _name){
        this.name = _name;
    }
    public void initialize(String _name, int _age){
        this.name = _name;
        this.age = _age;
    }
    public void initialize(String _name, int _age, String _sex){
        this.name = _name;
        this.age = _age;
        this.sex = _sex;
    }
}
