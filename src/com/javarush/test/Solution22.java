package com.javarush.test;

public class Solution22 {
    public static void main(String[] args){
        Cat cat1 = new Cat();
        cat1.name = "Жучка";
        cat1.age = 8;
        cat1.weight = 22;
        cat1.strength = 100;

        Cat cat2 = new Cat();
        cat2.name = "Дружок";
        cat2.age = 8;
        cat2.weight = 22;
        cat2.strength = 89;

        Cat cat3 = new Cat();
        cat3.name = "Мурзик";
        cat3.age = 1;
        cat3.weight = 22;
        cat3.strength = 89;
        
        boolean result1 = cat1.fight(cat2);
        boolean result2 = cat1.fight(cat3);
        boolean result3 = cat2.fight(cat3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
