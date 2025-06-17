//Finding the Maximum and Minimum
import java.util.Scanner;
public class MaxMin_01 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner s= new Scanner(System.in);
        num1=s.nextInt();
        num2=s.nextInt();
        int max=Math.max(num1,num1);
        int min=Math.min(num1,num2);
        System.out.println("Maximum number : "+max);
        System.out.println("Minimum number : "+min);
    }
}
