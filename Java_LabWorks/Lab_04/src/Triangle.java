import java.util.Scanner;
public class Triangle {
    private double height;
    private double base;
    public Triangle(double h, double b){
        this.height=h;
        this.base=b;
    }
    public void setHeight(double x){
        height=x;
    }
    public double getHeight(){
        return height;
    }
    public void setBase(double x){
        base=x;
    }
    public double getBase(){
        return base;
    }
    public double getArea(){
        return (height*base);
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter Height and Base of the triangle :");
        double Height=sc.nextDouble();
        double Base=sc.nextDouble();

        Triangle T= new Triangle(Height,Base);
        System.out.println("Enter a new Height: ");
        T.setHeight(sc.nextDouble());
        sc.nextLine();

        System.out.println("Enter a new Base: ");
        T.setBase(sc.nextDouble());
        sc.nextLine();
        System.out.println("You have entered Height and base :");
        System.out.println(T.getHeight());
        System.out.println( T.getBase());
        System.out.println("Area = "+T.getArea());

    }
}
