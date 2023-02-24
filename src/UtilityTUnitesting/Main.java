package UtilityTUnitesting;

import UtilityTUnitesting.MathUtility;
// ^ we are going to import the methods for this particular class, we want to use this


public class Main {

    public static void main(String[] args) {
        
        //Test the add method
        int num1 = 5;
        int num2 = 10;
        int sum = MathUtility.add(num1, num2);
        System.out.print(sum);

    }
}
