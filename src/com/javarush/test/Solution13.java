package com.javarush.test;

import java.io.IOException;

public class Solution13 {
    public static void main(String[] args) throws IOException {

        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.print((i * j) + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
