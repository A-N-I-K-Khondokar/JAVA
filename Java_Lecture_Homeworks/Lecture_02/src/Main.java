/*
##Suppose you are given the following
    double a=56.34, b=6.58334, c=-34.4265;
1. Calculate the following value:
2. Print the pi’s value and e’s value
3. Print a random number.
4. Find the absolute value of the variable c
5. Find the square root of a
6. Find the maximum value between a and b
7. Calculate the value a^b
8. Round the number a
9. Calculate the value of √(a2+b2)
10. Find the floor, ceil and round value of b and c
11. Find the radian value of a.
12. Find the sin value of a where a represents the degree
*/

import java.sql.SQLOutput;
import java.util.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        double a=56.54, b=6.58334, c=-34.4265;
        //1
        System.out.println(Math.PI);
        System.out.println(Math.E);
        //2
        Random r= new Random();
        double randomNumber= r.nextDouble();
        int randomNumber2=r.nextInt(100);
        System.out.println(randomNumber);
        System.out.println(randomNumber2);
        //3
        System.out.println("Absolute value of c : "+Math.abs(c));
        //4
        System.out.println("Square root of a : "+Math.sqrt(a));
        //5
        System.out.println("Maximum between a and b is : "+Math.max(a,b));
        //6
        System.out.println("The value of a^b is : "+Math.pow(a,b));
        //7
        System.out.println("Round Number of a is : "+Math.round(a));
        //8
        System.out.println("The value of √(a2+b2) : "+Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
        //9
        System.out.println("Floor of b and c: "+Math.floor(b)+", "+Math.floor(c));
        System.out.println("Ceil of b and c: "+Math.ceil(b)+", "+Math.ceil(c));
        System.out.println("Round of b and c: "+Math.round(b)+", "+Math.round(c));
        //10
        System.out.println("Radian Value of a : "+Math.toRadians(a));
        //11
        System.out.println("Value of sinA (where A is in degree): "+Math.sin(Math.toRadians(a)));
    }
}