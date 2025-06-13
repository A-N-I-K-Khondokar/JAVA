/*Why it is better then Exit Program:
    1.Allow the Program to keep running.
    2.The caller can decide what to do if an exception occurred!
 */
public class Error_Code {
    static int divide(int x,int y)
    {
        if(y==0){
            return -1;  //By this the flow of the program remain stable!
        }
        return x/y;
    }

    public static void main(String[] args) {
      int result=divide(10,0);
      if(result==-1){ // check the Error!
          System.err.println("Can not be divide by Zero!");
      }else{
          System.out.println(result);
      }

    }
}
