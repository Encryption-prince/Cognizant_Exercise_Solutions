package Cognizant_Exercise_Solutions.core_java_solutions;

import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Welcome to Number Guessing Game---");
        System.out.println("Choose Difficulty Level : \n1.Easy\n2.Medium\n3.Hard");
        int difficulty = sc.nextInt();
        int rnum = (int) (Math.random() * 100 + 1);
        System.out.println("Guess the number between 1-100");
        int input, c = 0;
        do {
            System.out.print("Enter your Guess : ");
            input = sc.nextInt();
            if (input == rnum)
                break;
            else if (input - rnum > 5 * difficulty)
                System.out.println("Too High Guess");
            else if (rnum - input > 5 * difficulty)
                System.out.println("Too Low Guess");
            else
                System.out.println("You are Too Close");
            c++;
        } while (input != rnum);
        System.out.println("Congrats you took " + c + " choice to guess right!!!");
        sc.close();
    }
}
