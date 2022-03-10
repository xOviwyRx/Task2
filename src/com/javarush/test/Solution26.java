package com.javarush.test;

import java.util.Date;

public class Solution26 {
    public static void main(String[] args)
    {
        Date currentDate = new Date();
        System.out.println(currentDate.getDate() + " " + currentDate.getMonth() + " " + currentDate.getYear());
    }

}
