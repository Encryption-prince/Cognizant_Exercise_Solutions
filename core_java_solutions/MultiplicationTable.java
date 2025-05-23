package Cognizant_Exercise_Solutions.core_java_solutions;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Multiplication Table---");
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "\t*\t" + n + "\t=\t" + (i * n));
        }
        sc.close();
    }
}
