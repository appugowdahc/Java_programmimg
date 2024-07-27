
interface Animal{
    /* subclasses must implement all interfaces methods */
    void shownName();
    void makeSound();
    void eat();
    void sleep();

}
// we can extend or inherit interface using extend keyword
interface NewAnimal extends Animal{
    void canAnimalFly();
}
interface Milk {

    void isProvideMilk();

    default void printAnimalBreed(){
        System.out.println("This Animal is hybrid..");
    }

    
}

class Dog implements Animal{
    
    public void shownName(){
        System.out.println("This is Dog..");

    }
    public void makeSound(){
        System.out.println("bow bow.....");

    }
    public void eat(){
        System.out.println("Dog is eating..");

    }
    public void sleep(){
        System.out.println("Dog is sleeping...");

    }
}


class Cat implements NewAnimal{
    public void shownName(){
        System.out.println("This is cat..");
    }
    public void eat(){
        System.out.println("Cat can eat and drink...");
    }
    public void makeSound(){
        System.out.println("Moew moew.....");
    }
    public void canAnimalFly(){
        System.out.println("Cat can not fly");
    }
    public void sleep(){
        System.out.println("Cat is sleeping...");
    }
}

// one class can implements multiple interfaces
class Cow implements NewAnimal,Milk{
    public void shownName(){
        System.out.println("This is cat..");
    }
    public void eat(){
        System.out.println("Cat can eat and drink...");
    }
    public void makeSound(){
        System.out.println("Moew moew.....");
    }
    public void canAnimalFly(){
        System.out.println("Cat can not fly");
    }
    public void sleep(){
        System.out.println("Cat is sleeping...");
    }
    public void isProvideMilk(){
        System.out.println("Cow can provide milk...");
    }
    public void printAnimalBreed(){
        System.out.println("This is hybrid cow..");
    }
}
public class InterfaceType {
    /*
     
    An interface in Java is a reference type, similar to a class, that can contain 
    only constants, method signatures, default methods, static methods, and nested 
    types. Interfaces cannot contain instance fields or constructors, and the methods 
    within interfaces are abstract by default (i.e., they do not have a body).

    Use Cases:-

        1.Contract for Classes: Interfaces provide a way to define a contract that 
            classes must follow.
        2.Multiple Inheritance: Since Java does not support multiple inheritance for 
            classes, interfaces allow a class to inherit behavior from multiple sources.
        3.Polymorphism: Interfaces enable polymorphism by allowing objects of different
             classes to be treated as objects of an interface type.
     */

    public static void main(String[] args){

        Animal dog = new Dog();
        dog.shownName();
        dog.eat();
        dog.makeSound();
        dog.sleep();

        NewAnimal cat = new Cat();
        cat.shownName();
        cat.eat();
        cat.makeSound();
        cat.canAnimalFly();
        cat.sleep();


        Cow cow = new Cow();

        cow.printAnimalBreed();

    }
    
}
