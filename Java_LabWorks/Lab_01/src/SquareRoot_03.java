/*
Ask the user for a number and use
Math.sqrt() to calculate its square root.
If the number is negative, print an error message.
 */

import java.util.Scanner;

public class SquareRoot_03 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int x=s.nextInt();
        System.out.println("Square Root of the Number is :"+Math.sqrt(x));
    }
}
