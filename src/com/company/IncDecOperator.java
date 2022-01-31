package com.company;

public class IncDecOperator {
    public static void main(String[] args) {
        int b = 2;
        System.out.println(b);

        int a = ++b; // first increment then use
        int c = b++;// first use then increment

        System.out.println(a);
        System.out.println(c);
        System.out.println(b);
    }
}
