package com.javarush.test;

import java.io.*;

public class Solution17 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
//        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i=0; i<10; i++)
            System.out.println(name + " любит меня");
    }
}
