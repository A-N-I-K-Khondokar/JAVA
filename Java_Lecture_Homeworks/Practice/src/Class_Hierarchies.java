//clean up
//garbage collector
//finalized method of Object Class
//Class hierarchies
class A{
    int x;
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Before done anything else!");
        super.finalize();
    }
    void display(){
        System.out.println("Displaying!");
    }
}
class B extends A{
    int y;
}
class C extends B{
    int z;
}

public class Class_Hierarchies {
    public static void main(String[] args) {

        C c= new C();
        c.display();
        c=null;  // Eligible for cleanup or garbage collector
        System.gc(); //suggest garbage collection but not guaranteed!
    }

}
