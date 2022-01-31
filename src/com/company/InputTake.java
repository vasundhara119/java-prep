package com.company;

import java.util.Scanner;

public class InputTake {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is");
        System.out.println(sum);
        System.out.println("Enter any string");
        String str = sc.next();
        System.out.println(str);
        System.out.println("Enter any statement");
        String str1 = sc.nextLine();
        System.out.println(str1);
    }
}
