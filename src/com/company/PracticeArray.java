package com.company;

import java.sql.SQLOutput;

public class PracticeArray {
    public static void main(String[] args) {
//        float div = Math.floorDiv(18,5);
//        System.out.println(div);

        // Find the max min element in an array

        int[] arr = {211, 32, 55, 34, 344, 334, 56};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        int minInt = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minInt) {
                minInt = arr[i];
            }
        }
        System.out.println("Min value: "+ minInt);
    }
}
