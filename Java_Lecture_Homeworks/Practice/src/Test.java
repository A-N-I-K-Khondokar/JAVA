
import java.util.*;
class Anik{
    protected int i;
    Anik(int i){
        this.i=i;
    }
}
class Bonik extends Anik{
    protected int i;
    Bonik(int a,int b){
        super(a);
        this.i=b;
    }
    void print_super(){
        System.out.println(super.i);
    }


}

public class Test {
    public static void main(String[] args) {
      Anik a= new Anik(5);
      Bonik b=new Bonik(6,7);
        System.out.println(a.i);
        System.out.println(b.i);
        b.print_super();
    }
}

