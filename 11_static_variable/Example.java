public class Example {
    // Static variable
    static int staticVariable = 10;

    // Instance variable
    int instanceVariable = 20;

    public static void main(String[] args) {
        // Accessing static variable directly using the class name
        System.out.println("Static variable: " + Example.staticVariable);

        // Creating instances of the class
        Example obj1 = new Example();
        Example obj2 = new Example();

        // Accessing instance variable
        System.out.println("Instance variable of obj1: " + obj1.instanceVariable);
        System.out.println("Instance variable of obj2: " + obj2.instanceVariable);

        // Modifying static variable using one object
        obj1.staticVariable = 30;

        // Accessing static variable using the class name and other object
        System.out.println("Static variable after modification by obj1: " + Example.staticVariable);
        System.out.println("Static variable accessed by obj2: " + obj2.staticVariable);
    }
}
