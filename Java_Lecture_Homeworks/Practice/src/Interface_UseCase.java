interface Computer{
    void code();
}

class laptop implements Computer{
    public void code(){
        System.out.println("Coding using laptop!");
    }
}

class desktop implements Computer{
    public void code(){
        System.out.println("Coding using computer!");
    }
}

class Developer{
    void devCode(Computer c){
        c.code();
    }
}

public class Interface_UseCase {
    public static void main(String[] args) {
        Computer lap= new laptop();
        Computer desk=new desktop();
        Developer dev1= new Developer();
        Developer dev2= new Developer();
        dev1.devCode(lap);
        dev2.devCode(desk);

    }
}
