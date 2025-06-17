import java.util.Scanner;
/*
Write a program that accepts two numbers: base and exponent.
Use Math.pow() to calculate the result and display it.
 */
public class PowerCalculation_04 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Two Number : ");
        int num1=s.nextInt();
        int num2=s.nextInt();
        double Power=Math.pow(num1,num2);
        System.out.println("Power of num1^num2 is : "+Power);
    }
}
