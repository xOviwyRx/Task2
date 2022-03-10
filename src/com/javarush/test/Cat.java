package com.javarush.test;

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;
    public boolean fight(Cat anotherCat){
        if (this.strength > anotherCat.strength)
            return true;
        if (this.strength == anotherCat.strength
                && this.weight > anotherCat.weight)
            return true;
        return this.strength == anotherCat.strength
                && this.weight == anotherCat.weight
                && this.age < anotherCat.age;
    }
}
