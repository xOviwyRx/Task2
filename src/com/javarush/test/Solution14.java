package com.javarush.test;

import java.io.IOException;

public class Solution14 {
    public static void main(String[] args) throws IOException {

        for (int i = 1; i <= 100; i++){
            if (i%2 == 0)
                System.out.println(i);
        }
    }
}
