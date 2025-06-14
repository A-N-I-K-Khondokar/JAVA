public class Field {
    public int length;
    public int width;
    void setParameter(int x,int y){
        length=x;
        width=y;
    }
    int computeArea(){
        return (length*width);
    }
    int computePerimeter(){
        return (2*(length+width));
    }

    public static void main(String[] args) {
        Field f1= new Field();
        f1.setParameter(5,6);
        int area=f1.computeArea();
        int perimeter=f1.computePerimeter();

        System.out.println("Area is : "+area+" "+"And perimeter is : "+perimeter);
    }
}
