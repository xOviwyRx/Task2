package com.javarush.test;

public class Solution0 {
    public static void main(String[] args){
        Cat0 cat1 = new Cat0();
        Cat0.count += 1;
        cat1.setName("Рыжик");
        System.out.println(cat1.getName());

        Cat0.addNewCat();
        System.out.println(Cat0.getCatsCount());
        Cat0.setCatsCount(4);
        System.out.println(Cat0.getCatsCount());

        Cat0 cat2 = new Cat0();
        Cat0.count += 1;
        cat2.setName("Кот", "Леопольд");
        System.out.println(cat2.getFullName());
        System.out.println(Cat0.count);
    }
}
