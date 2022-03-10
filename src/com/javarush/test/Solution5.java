package com.javarush.test;

import java.io.*;

public class Solution5 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();

        if (name1.equals(name2))
            System.out.println("Имена идентичны");
            else
                if (name1.length() == name2.length())
                    System.out.println("Длины имен равны");
    }
}
