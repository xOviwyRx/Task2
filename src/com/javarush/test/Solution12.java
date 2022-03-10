package com.javarush.test;

import java.io.*;

public class Solution12 {
    public static void main(String[] args) throws IOException {

        int i = 10;
        while (i > 0) {
            int j = 10;
            while (j > 0) {
                System.out.print('S');
                j--;
            }
            System.out.println();
            i--;
        }
    }
}
