class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class DynamicMethodDispatch {
    /*
    Dynamic method dispatch--> also known as runtime polymorphism or method overriding,
    is a mechanism in Java that allows a method to be called based on the runtime 
    type of the object rather than the compile-time type. This is achieved through 
    method overriding, where a subclass provides a specific implementation for a method
    that is already defined in its superclass.

    How Dynamic Method Dispatch Works:-

    When a superclass reference variable refers to a subclass object, the overridden 
    method in the subclass is invoked at runtime, not the method defined in the s
    uperclass. This allows Java to support runtime polymorphism.

     */
    public static void main(String[] args) {
        Animal animal;

        animal = new Dog();  // Animal reference to Dog object
        animal.makeSound();  // Outputs: Bark

        animal = new Cat();  // Animal reference to Cat object
        animal.makeSound();  // Outputs: Meow
    }
}
