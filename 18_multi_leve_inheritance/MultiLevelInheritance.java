// Base class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

// Further derived class
class Puppy extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

public class MultiLevelInheritance {
    /*
     Multi-level inheritance:- 
        in Java is a type of inheritance where a class is derived from another class, 
        which is also derived from another class. This forms a hierarchy of inheritance 
        with multiple levels, hence the name multi-level inheritance. In other words, a 
        subclass inherits from a superclass, and then another class inherits from this 
        subclass, creating a chain of inheritance.

    Key Points:-

        --> Inheritance Hierarchy: In multi-level inheritance, there is a hierarchy where 
        classes inherit from one another in a chain-like manner.

        --> Method Inheritance: A subclass inherits all the methods and fields from its 
        superclass. This continues up the inheritance chain.

        --> Method Overriding: Each subclass can override methods from its superclass 
        to provide specific implementations.

        --> Access to Superclass Members: A subclass can access members of its super
        class using the super keyword, but it can also directly access public and 
        protected members.
     */
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        
        // Calling methods from all levels of the inheritance hierarchy
        puppy.eat();   // Inherited from Animal
        puppy.bark();  // Inherited from Dog
        puppy.weep();  // Defined in Puppy
    }
}
