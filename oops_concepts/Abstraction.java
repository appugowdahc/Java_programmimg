package oops_concepts;

// Abstract class
abstract class Animal {
    // Abstract method (must be implemented by subclasses)
    abstract void makeSound();

    // Concrete method
    void eat() {
        System.out.println("This animal is eating");
    }
}

// Subclass (inherited from Animal)
class Dog extends Animal {
    // Providing implementation for the abstract method
    void makeSound() {
        System.out.println("Bark");
    }
}

// Subclass (inherited from Animal)
class Cat extends Animal {
    // Providing implementation for the abstract method
    void makeSound() {
        System.out.println("Meow");
    }
}

public class Abstraction {
    /*
    
    Abstract Classes and Methods in Java:-

        In Java, abstraction is the process of hiding the implementation details and 
        showing only the functionality to the user. Abstract classes and methods help 
        achieve this by allowing you to define methods that do not have an implementation 
        in the base class but are expected to be implemented in derived classes.

    Abstract Classes:-

        An abstract class is a class that cannot be instantiated on its own and must be 
        subclassed. It can contain both abstract methods (methods without a body) and 
        concrete methods (methods with a body).

    Abstract Methods:-

        An abstract method is a method that is declared without an implementation. The 
        implementation is provided by subclasses.

    Key Points:-

        --> Cannot Instantiate Abstract Classes: You cannot create an instance of an 
            abstract class directly. You must create an instance of a subclass that 
            implements the abstract methods.

        --> Abstract Methods: Abstract methods in an abstract class must be implemented 
            by any concrete subclass. If a subclass does not implement all abstract 
            methods, it must also be declared abstract.

        --> Concrete Methods in Abstract Classes: An abstract class can have both abstract 
            methods (without a body) and concrete methods (with a body). This allows 
            the abstract class to provide some default behavior while enforcing subclasses 
            to provide specific behavior for abstract methods.

        --> Polymorphism: Abstract classes are often used to achieve polymorphism. You 
            can define a reference of the abstract class type and assign it to any 
            subclass object. This allows you to write code that works with the abstract 
            class type but can operate on objects of any subclass.

    Abstract Classes vs. Interfaces:-

        While both abstract classes and interfaces are used to achieve abstraction, 
        they have some key differences:

        Abstract Class:-

        Can have both abstract and concrete methods.
        Can have member variables.
        Can have constructors.
        Can provide default behavior.
        A class can extend only one abstract class (single inheritance).

        Interface:-

        Can have only abstract methods (Java 7 and earlier). From Java 8, interfaces can have default and static methods.
        Cannot have member variables (except for static final constants).
        Cannot have constructors.
        Cannot provide default behavior (prior to Java 8).
        A class can implement multiple interfaces (multiple inheritance).

     */
    public static void main(String[] args) {
        // Cannot instantiate an abstract class
        // Animal animal = new Animal(); // This would cause an error

        // Instantiating the subclasses
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // Outputs: Bark
        dog.eat();       // Outputs: This animal is eating

        cat.makeSound(); // Outputs: Meow
        cat.eat();       // Outputs: This animal is eating
    }
}
