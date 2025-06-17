/*
Accept an integer input from the user and use
Math.abs() to calculate its
absolute value.
 */
import java.util.Scanner;
public class AbsoluteValue_02 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x = s.nextInt();
        int AbsoluteValue=Math.abs(x);
        System.out.println("The absolute value is : "+AbsoluteValue);
    }
}
