package com.company;

import java.util.Scanner;

public class PracticeLoops {
    public static void main(String[] args) {

        //Pattern
//        System.out.println("Enter numer of rows");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i<n; i++){
//            for (int j = n ; j>i ; j--){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        //sum first n even numbers using whil loop
//        System.out.println("Enter numer");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i=0, sum=0;
//        while(i<n){
//            sum += (2*i);
//            i++;
//        }
//        System.out.println(sum);

        //Multiplication table for n
        System.out.println("Enter numer");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=10;i++){
            System.out.println(n+ "*" + i + "=" + n*i);
            sum += (n*i);
//            System.out.printf("%d x %d = %d\n" , n, i, n*i);
        }
        System.out.println("Sum=" + sum);

    }
}
