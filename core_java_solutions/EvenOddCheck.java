package Cognizant_Exercise_Solutions.core_java_solutions;

import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println(n + " is Even.");
        else
            System.out.println(n + " is Odd.");
        sc.close();
    }
}
