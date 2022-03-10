package com.javarush.test;

import java.io.*;

public class Solution4 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int number1 = Integer.parseInt(bufferedReader.readLine());
        int number2 = Integer.parseInt(bufferedReader.readLine());
        int number3 = Integer.parseInt(bufferedReader.readLine());

        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println(number1);
                if (number2 > number3) {
                    System.out.println(number2);
                    System.out.println(number3);
                } else {
                    System.out.println(number3);
                    System.out.println(number2);
                }
            }
            else
                System.out.println(number3);
                System.out.println(number1);
                System.out.println(number2);
        }
        else
            if (number2 > number3){
                System.out.println(number2);
                if (number1 > number3) {
                    System.out.println(number1);
                    System.out.println(number3);
                }
                else{
                    System.out.println(number3);
                    System.out.println(number1);
                }
            }
            else{
                System.out.println(number3);
                System.out.println(number2);
                System.out.println(number1);
            }

    }
}
