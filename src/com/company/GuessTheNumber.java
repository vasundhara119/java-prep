package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    Random random = new Random();
    int cnum;
    static int num;

    Game() {
        this.cnum = random.nextInt(50);
    }

    public static int setNum() {
        System.out.println("Guess a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        return num;
    }

    public static void isCorrectNum( int num, Game compObj){
        if (num == compObj.cnum){
            System.out.println("Woohoooo you got it");
        }
        else if (num < compObj.cnum){
            System.out.println("too low..");
        }
        else{
            System.out.println("too high...");
        }
    }
}

public class GuessTheNumber {
    //My Way
    /*
    Random random = new Random();
    int cnum;
    static int num;

    public GuessTheNumber(){
        cnum = random.nextInt(50);
    }

    public static void main(String[] args) {
        GuessTheNumber compObj = new GuessTheNumber();
        int guess = 0;
         do {
            num = takeUserInput();
            isCorrectNum(num, compObj);
            guess++;
         } while (! (num == compObj.cnum));
        System.out.printf("You guessed the number in %d guess", guess);
    }

    public static int takeUserInput(){
        System.out.println("Guess a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        return num;
    }

    public static void isCorrectNum( int num, GuessTheNumber compObj){
        if (num == compObj.cnum){
            System.out.println("Woohoooo you got it");
        }
        else if (num < compObj.cnum){
            System.out.println("Your number is smaller than the number");
        }
        else{
            System.out.println("Your number is greater than the number");
        }
    }
    */

    //Online way
    public static void main(String[] args) {
        Game compObj = new Game();
        int guess = 0;
        int num;
        do {
            num = Game.setNum();
            Game.isCorrectNum(num, compObj);
            guess++;
        } while (! (num == compObj.cnum));
        System.out.printf("You guessed the number in %d guess", guess);
    }


}
