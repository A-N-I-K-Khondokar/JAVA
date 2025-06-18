import java.util.Scanner;
class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}

public class EvenNumberChecker{
    public  static  void EvenNumberChecker(int number) throws MyException{
        if(number%2!=0){
            throw new MyException("This is a odd Number!");
        }else {
            System.out.println("Your number is Even :"+number);
        }
    }

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int number=sc.nextInt();
       try {
            EvenNumberChecker(number);
       }catch (MyException e){
           System.err.println("Excepton Caught! : "+e.getMessage());

        }
    }
}