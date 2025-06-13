class Animal{
    void sound(){
        System.out.println("Bonna is Barking ");
    }
}
class Dog extends Animal{
    void sound(){
        super.sound();
        System.out.println("Bark!");
    }
}
public class Main {
    public static void main(String[] args) {

        Dog Bonna = new Dog();
        Bonna.sound();
        Animal a= new Animal();
        a.sound();

    }
}