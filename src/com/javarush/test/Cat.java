package com.javarush.test;

public class Cat {
    private String name;
    private static int catsCount = 0;

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public static int getCatsCount(){
        return catsCount;
    }
    public static void addNewCat()
    {
        catsCount += 1;
    }
    public static void setCatsCount(int catsCount)
    {
        Cat.catsCount = catsCount;
    }

    private String fullName;
    public void setName(String firstName, String lastName)
    {
        String fullName = firstName + lastName;
        this.fullName = fullName;
    }
    public String getFullName(){
        return this.fullName;
    }
    public static int count = 0;
}
