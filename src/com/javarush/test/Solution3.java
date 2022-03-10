package com.javarush.test;

import java.io.*;
import java.sql.Array;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int number1 = Integer.parseInt(bufferedReader.readLine());
        int number2 = Integer.parseInt(bufferedReader.readLine());
        int number3 = Integer.parseInt(bufferedReader.readLine());
        int number4 = Integer.parseInt(bufferedReader.readLine());
        if (number1 > number2 && number1 > number3
            && number1 > number4)
                    System.out.println(number1);
        else
            if (number2 > number3 && number2 > number1
                    && number2 > number4)
                System.out.println(number2);
            else
                if (number3 > number2 && number3 > number4
                        && number3 > number1)
                    System.out.println(number3);
                else
                    System.out.println(number4);
    }
}
