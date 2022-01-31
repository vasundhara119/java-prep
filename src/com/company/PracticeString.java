package com.company;

public class PracticeString {
    public static void main(String[] args) {
//        Replace space with underscore
//        String name = "Vasundhara tyagi";
//        name = name.replace(" ", "_");
//        System.out.println(name);

        // where are double or triple space in sentnce
        String name = "Vasundhara tyagi, how  are  you";
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));

    }
}
