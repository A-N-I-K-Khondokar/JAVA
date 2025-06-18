import java.sql.SQLOutput;
import java.util.Scanner;

class NegativeNumException extends Exception{
    public NegativeNumException(String message){
        super(message);
    }
}
class FirstSmallerException extends Exception{
    public FirstSmallerException(String message){
        super(message);
    }
}
class SecondNumZeroException extends Exception{
   public SecondNumZeroException(String message){
        super(message);
    }
}


public class MyOwnException {

    public static void CheckMultiple(double num1,double num2) throws NegativeNumException,FirstSmallerException,SecondNumZeroException{
        if(num1<0 || num2<0){
            throw new NegativeNumException("One of the Number is Negative!");
        }
        if (num1<num2){
            throw new FirstSmallerException("1st Number is Smaller!");
        }
        if(num2==0){
            throw new SecondNumZeroException("Second number is Zero!");
        }
        if(num1%num2==0){
            System.out.println(num1+" is a multiple of "+num2);
        }else {
            System.out.println(num1+" is not a multiple of "+num2);
        }
    }



    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1 and Number 2 :");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        try{
            CheckMultiple(num1,num2);
        }catch (NegativeNumException e){
            System.err.println(e.getMessage());
        }catch (FirstSmallerException e){
            System.err.println(e.getMessage());
        }catch (SecondNumZeroException  e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("program work done!");
        }
    }

}
