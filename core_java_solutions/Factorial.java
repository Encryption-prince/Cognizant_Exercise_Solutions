package Cognizant_Exercise_Solutions.core_java_solutions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Factorial Calculator---");
        System.out.print("Enter a non-negative number : ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid Input!!Please Try Again");
            System.exit(0);
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is : " + fact);
        sc.close();
    }
}
