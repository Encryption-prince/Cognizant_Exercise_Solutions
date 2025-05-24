package Cognizant_Exercise_Solutions.core_java_solutions;

public class OperatorPrec {
    public static void main(String[] args) {
        double res = 4 + 10 / 2 * 3 - (8 / 4);
        System.out.println("Result of 4+60/2*3-(8/4) expression : " + res);
        /*
         * Explaination of the Result
         * --------------------------
         * BODMAS RULE
         * 1st op : (8/4) = 2 => Bracket
         * 2nd op : 10/2 = 5 => Division
         * 3rd op : 5*3 = 15 => Multiplication
         * 4th op : 4+15 = 19 => Addition
         * 5th op : 19-2 = 17 => Substraction
         * Result : 17
         * -----------------------------------------------------------------------------
         * ----
         * Diviion & Multiplication have same priority (decided by associativity
         * left->right)
         * same with Addition & Substraction
         */
    }
}
