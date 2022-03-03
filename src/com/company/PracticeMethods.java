package com.company;

public class PracticeMethods {
//    static int sum(int n){
//        if (n==1){
//            return 1;
//        }
//        else {
//            return n + sum(n - 1);
//        }
//    }
    static int avg;
    static int average(int ...args){
        int sum = 0, j =0;
        for (int i:args) {
              sum +=  i;
              j++;
        }
        return avg = sum / j;
    }

    public static void main(String[] args) {
//        int z = sum(3);
//        System.out.println(z);
        System.out.println("Average is:"+ average(1,2,3));
    }
}

