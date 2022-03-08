package com.javarush.test;

public class Solution {
    public static void main(String[] args){
        Cat cat1 = new Cat();
        Cat.count += 1;
        cat1.setName("Рыжик");
        System.out.println(cat1.getName());

        Cat.addNewCat();
        System.out.println(Cat.getCatsCount());
        Cat.setCatsCount(4);
        System.out.println(Cat.getCatsCount());

        Cat cat2 = new Cat();
        Cat.count += 1;
        cat2.setName("Кот", "Леопольд");
        System.out.println(cat2.getFullName());
        System.out.println(Cat.count);
    }
}
