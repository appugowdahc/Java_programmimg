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

public class Downcasting {
    public static void main(String[] args) {
        Animal animal = new Dog(); // initially upcasting from Dog obj to Animal obj

        /* here we assigning animal obj to child obj Dog */
        Dog dog = (Dog) animal;    // Downcasting (explicit)
        
        dog.makeSound(); // Outputs: Bark
        dog.fetch();     // Outputs: Fetching the ball
    }
}
