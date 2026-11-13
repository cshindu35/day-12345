abstract class Animal{
    abstract void sound();
    abstract void behaviour();
      abstract void color();{
        System.out.println("Animal color: white");
             }
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog object created");
    }
    void sound(){
        System.out.println("Dog sound: Bark");

    }
    void behaviour(){
        System.out.println("Dog behaviour: Friendly and loyal" );

    }
    void color(){
        System.out.println("Dog color: black");
            }
}
public class Main5{
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.sound();
        myDog.behaviour();
        myDog.color();
    }
}

     