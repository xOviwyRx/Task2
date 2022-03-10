package com.javarush.test;

import java.io.*;

public class Solution20 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        int number = Integer.parseInt(bufferedReader.readLine());
        int sum = 0;
        while (number != -1) {
            sum += number;
            number = Integer.parseInt(bufferedReader.readLine());
        }
        sum -= 1;

        System.out.println(sum);
    }
}
