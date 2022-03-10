package com.javarush.test;

import java.io.*;
import java.util.Date;

public class Solution27 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        String numberString = bufferedReader.readLine();
        int number;
        int sum = 0;
        while (!numberString.equals("сумма")) {
            number = Integer.parseInt(numberString);
            sum += number;
            numberString = bufferedReader.readLine();
        }

        System.out.println(sum);
    }

}
