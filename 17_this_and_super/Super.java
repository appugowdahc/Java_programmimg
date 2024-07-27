class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Calls the constructor of Animal
        System.out.println("Dog constructor");
    }
}

public class Super {
    /*
    super Keyword:-
        The super keyword refers to the superclass (parent class) of the current object.
        It is used to:

            1. all the superclass constructor.
            2. Access superclass methods and variables that are hidden by the subclass.
    
    
            */  
    public class Main {
        public static void main(String[] args) {
            Dog dog = new Dog(); // Outputs: Animal constructor, Dog constructor
        }
    }
    
    
}
