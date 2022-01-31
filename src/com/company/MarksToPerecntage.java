package com.company;

import java.util.Scanner;

public class MarksToPerecntage {
    public static void main(String[] args) {
        System.out.println("Marks -----> Percentage");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maximum marks:");
        float maxMarks = sc.nextFloat();
        System.out.println("Enter marks in Subject 1:");
        float sub1 = sc.nextFloat();
        System.out.println("Enter marks in Subject 2:");
        float sub2 = sc.nextFloat();
        System.out.println("Enter marks in Subject 3:");
        float sub3 = sc.nextFloat();
        System.out.println("Enter marks in Subject 4:");
        float sub4 = sc.nextFloat();
        System.out.println("Enter marks in Subject 5:");
        float sub5 = sc.nextFloat();
        float sum = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println(sum);
        float percentage = 100*(sum / maxMarks);

        System.out.println("Percentage of student is: " + percentage);

    }
}
