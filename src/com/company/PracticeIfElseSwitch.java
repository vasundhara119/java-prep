package com.company;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class PracticeIfElseSwitch {
    public static void main(String[] args) {
        // Question : Student pass or fail
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter marks in subject 1");
//        float sub1 = sc.nextFloat();
//
//        System.out.println("Enter marks in subject 2");
//        float sub2 = sc.nextFloat();
//
//        System.out.println("Enter marks in subject 3");
//        float sub3 = sc.nextFloat();
//
//        float percentage = (sub1 + sub2 + sub3)/3;
//
//        if (percentage >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >= 33){
//            System.out.println("Congratulations! you are pass");
//        }
//        else {
//            System.out.println("Better luck next time") ;
//        }

        // Question : Calculate income tax
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in lakhs per annum");
//        float income = sc.nextFloat();
//        float tax = 0f;
//
//        if (income<=2.5f){
//            tax += 0;
//        }
//        if (income>2.5f && income<=5f){
//            tax += 0.05f * (income - 2.5f);
//        }
//        if (income>5f && income<=10f){
//            tax += 0.05f * (5f - 2.5f);
//            tax += 0.2f * (income - 5f);
//        }
//        if (income>10.0f){
//            tax += 0.05f * (5f - 2.5f);
//            tax += 0.2f * (10f - 5f);
//            tax += 0.3f * (income - 10f);
//        }
//
//        System.out.println("Your calculated income tax is " + tax);

        // Question : Find day of the week
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any number");
//        int day = sc.nextInt();
//
//        switch (day) {
//            case 1 -> System.out.println("Day is monday");
//            case 2 -> System.out.println("Day is tuesday");
//            case 3 -> System.out.println("Day is wednessday");
//            case 4 -> System.out.println("Day is thrusday");
//            case 5 -> System.out.println("Day is friday");
//            case 6 -> System.out.println("Day is saturday");
//            case 7 -> System.out.println("Day is sunday");
//        }

        // Question : Leap year or not
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any year");
//        int year = sc.nextInt();
//
//        if ((year % 4) == 0 && (year % 100) == 0 && (year % 400) == 0){
//            System.out.println("year is leap year");
//        }
//        else{
//            System.out.println("Not a leap year");
//        }

        // Question : Type of website from url
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any website");
        String website = sc.next();

        if (website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if (website.endsWith(".in")){
            System.out.println("This is an indian website");
        }
        else if (website.endsWith(".com")){
            System.out.println("This is an commertial website");
        }



    }

}
