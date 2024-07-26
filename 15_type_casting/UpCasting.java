class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
    
    void fetch() {
        System.out.println("Fetching the ball");
    }
}
public class UpCasting {
    /*
    There are two methods in type casting 
    
    Upcasting: 
        Upcasting is the process of converting a subclass type to a superclass type. 
        This type of casting is always safe and implicit, meaning it doesn't require 
        explicit casting. When you upcast, you move up the inheritance hierarchy. 

    Downcasting
        Downcasting is the process of converting a superclass type to a subclass type. 
        This type of casting is potentially unsafe and requires explicit casting. 
        When you downcast, you move down the inheritance hierarchy. It can lead to a 
        ClassCastException at runtime if the object being cast is not actually an 
        instance of the subclass.
     */

    public static void main(String[] args){

        double db = 4.5;
        int num = (int) db;
        

        Dog dog = new Dog(); // Dog object
        /*here you do upcasting by assigning Dog obj to parent or super obj */
        Animal animal = dog; // Upcasting (implicit)
        
        animal.makeSound(); // Outputs: Bark




    }
    
}
