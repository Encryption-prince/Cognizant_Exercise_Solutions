package Cognizant_Exercise_Solutions.core_java_solutions;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Calculator---");
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.println("Enter the operation to perform : ");
        System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Addition result : " + (a + b));

                break;
            case 2:
                System.out.println("Substraction result : " + (a - b));

                break;
            case 3:
                System.out.println("Multiplication result : " + (a * b));

                break;
            case 4:
                System.out.println("Division result : " + (int) (a / b));

                break;
            case 5:
                System.exit(0);

                break;

            default:
                System.out.println("Invalid Input!! Try again....");
                break;
        }
        sc.close();
    }
}
