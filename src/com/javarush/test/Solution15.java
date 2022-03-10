package com.javarush.test;

import java.io.*;

public class Solution15 {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int n = Integer.parseInt(bufferedReader.readLine());
        int m = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= n; j++)
                System.out.print(8);
            System.out.println();
        }
    }
}
