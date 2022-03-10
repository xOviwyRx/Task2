package com.javarush.test;

public class Solution24 {
    public static class Man{
        private String name;
        private int age;
        private String address;
        Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return this.name + " " +  this.age + " " + this.address;
        }
    }
    public static class Woman{
        private String name;
        private int age;
        private String address;
        Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        @Override
        public String toString() {
            return this.name + " " +  this.age + " " + this.address;
        }
        
    }
    
    public static void main(String[] args){
        Man man1 = new Man("Василий", 28, "Lenin Street");
        Man man2 = new Man("Иннокентий", 18, "Pushkina Street");
        Woman woman1 = new Woman("Василиса", 19, "Lenin Street");
        Woman woman2 = new Woman("Анастасия", 30, "Pushkina Street");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }
}
