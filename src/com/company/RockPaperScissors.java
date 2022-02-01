package com.company;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("This game include three values Rock = 0, Paper = 1, Scissors = 2");
        System.out.println("SELECT ANY NUMBER ACCORDING TO YOUR SELECTION \n");
        byte round = 1;
        byte user = 0, computer = 0;
        
        while (round<=5) {

            System.out.println("YOUR TURN!");
            Scanner sc = new Scanner(System.in);
            int u = sc.nextInt();

            System.out.println("COMPUTER'S TURN!");
            Random random = new Random();
            int c = random.nextInt(3);
            System.out.println(c);

            if ((c == 0 && u == 1) || (c == 1 && u == 2) || (c == 2 && u == 0)) {
                user++;
                System.out.println("Points for user :" + user);
                System.out.println("Points for computer :" + computer);

            }
            else if ((u == 0 && c == 1) || (u == 1 && c == 2) || (u == 2 && c == 0)) {
                computer++;
                System.out.println("Points for user :" + user);
                System.out.println("Points for computer :" + computer);
            }
            else{
                System.out.println("Points for user :" + user);
                System.out.println("Points for computer :" + computer);
            }
            
            round++;
        }
        
        if (user > computer) {
            System.out.println("**************");
            System.out.println("You won the match!!");
            System.out.println("**************");

        } else if (computer > user) {
            System.out.println("**************");
            System.out.println("Computer wins!!");
            System.out.println("**************");

        } else {
            System.out.println("**************");
            System.out.println("Match Draw!!");
            System.out.println("**************");

        }

    }
}
