package Cognizant_Exercise_Solutions.core_java_solutions;

public class TypeCastingEg {
    public static void main(String[] args) {
        double val1 = 35.54877;
        System.out.println("Original double value = " + val1);
        int val1_Casted = (int) val1;
        System.out.println("Type Casted int value = " + val1_Casted);

        int val2 = 48;
        System.out.println("Original int value = " + val2);
        double val2_Casted = (double) val2;
        System.out.println("Type Casted double value = " + val2_Casted);
    }
};
