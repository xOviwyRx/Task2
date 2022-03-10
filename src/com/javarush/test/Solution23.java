package com.javarush.test;

public class Solution23 {
    public static void main(String[] args){
        Duck duck1 = new Duck();
        duck1.setName("Макдак");
        Duck duck2 = new Duck();
        duck2.setName("Скрудж");

        System.out.println(duck1);
        System.out.println(duck2);

        CatConstructor cat1 = new CatConstructor("Маруся");
        CatConstructor cat2 = new CatConstructor("Муза");
        System.out.println(cat2);
        System.out.println(cat1);
        

        DogConstructor dog1 = new DogConstructor("Шарик", 8);
        DogConstructor dog2 = new DogConstructor("Бобик", 7, "рыжий");
        System.out.println(dog2);
        System.out.println(dog1);
    }
}
