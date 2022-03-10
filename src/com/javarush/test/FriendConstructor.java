package com.javarush.test;

public class FriendConstructor {
    private String name;
    private int age;
    private String sex;
    public FriendConstructor(String _name){
        this.name = _name;
    }
    public FriendConstructor(String _name, int _age){
        this.name = _name;
        this.age = _age;
    }
    public FriendConstructor(String _name, int _age, String _sex){
        this.name = _name;
        this.age = _age;
        this.sex = _sex;
    }
}
