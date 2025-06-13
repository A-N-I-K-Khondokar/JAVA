/*
Steps:
1.throws an Exception by returning an object.
2.use try block to perform the task.
3.use catch block to catch the Exception and handle it.
"note: steps 2 and 3 are in the main function."
 */
public class Throwing_Exception {
    static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Division by Zero!");
        }
        return (a/b);
    }

    public static void main(String[] args) {
        try{
            divide(10,0);
        }catch (ArithmeticException e){
            System.err.println("Error : "+e.getMessage());
        }
    }
}
