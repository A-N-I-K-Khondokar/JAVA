/*
What is in my Own Exception Class:
1.A constructor to load the radius,
2.A message.
How to use My Own Class:
1.throws the class
2.Create an object if Exception occurred by throw keyword.
In the main Function:
1.use try block to the code that might have an exception.
2.use catch block to catch the exception.
 */
class InvalidRadius extends Exception{
    private int r;
    InvalidRadius(int r){
        this.r=r;
    }
    void PrintError(){
        System.out.println("Not Valid Radius!");
    }
}
class Circle{
    int x,y,r;
    Circle(int x,int y,int r) throws InvalidRadius{
        if(r<=0){
            throw new InvalidRadius(r);
        }else{
            this.x=x;
            this.y=y;
            this.r=r;
        }
    }
}
public class Creating_Own_ExceptionClass {
    public static void main(String[] args) {
        try{
        Circle c1=new Circle(4,6,-1);
            System.out.println("A circle is created!");
    }catch (InvalidRadius e){
            e.PrintError();
        }
  }
}
