//package com.company;
//
//import static java.lang.Math.abs;
//
//public class PracticeWithNancy {
//    static int largestNum(int x, int y)
//    {
//        return (((x + y) + abs (x - y)) / 2);
//    }
//
//    public static void main(String[] args) {
//        int a = 4, b = 3;
//        System.out.print(largestNum(a, b));
//
//    }
//}
//
//
//// Java program to find Largest palindrome in an array
//
//import java.util.*;
//public class Main
//{
//    public static boolean check_palindrome(int n)
//    {
//        int div = 1;
//        while (n / div >= 10)
//            div *= 10;
//
//        while (n != 0)
//        {
//            int first = n / div;
//            int last = n % 10;
//
//// If first and last digits are not same then return false
//            if (first != last)
//                return false;
//
//// Removing the leading and trailing digits from the number
//            n = (n % div) / 10;
//// Reducing divisor by a factor of 2 as 2 digits are dropped
//            div = div / 100; }return true; }
//    public static int large_palindrome(int A[], int n)
//    { Arrays.sort(A);
//        for (int i = n – 1; i >= 0; –i) { if (check_palindrome(A[i]))
//        return A[i];
//    }
//        return -1;
//    }
//
////    public static void main (String[] args)
////    {
////        Scanner sc = new Scanner(System.in);
////        int num,i;
////        System.out.println(“Enter the number of entries: “);
////        num = sc.nextInt();
////        int a[] = new int[num];
////        System.out.println(“Enter the elements: “);
////        for(i=0; i<num; i++)
//        {
//            a[i] = sc.nextInt();
//        }
//        System.out.println(“Largest Palindrome: “);
//        System.out.print(large_palindrome(a,num));
//    }
//}
