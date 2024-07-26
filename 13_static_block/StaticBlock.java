
public class StaticBlock {
       /*
        * In this example:

            
        -The static block is executed first, initializing the static variable 
            staticVariable to 10.  
        -The main method is then executed, which prints the value of the static variable.
        -Finally, an instance of the Example class is created, which triggers the constructor.
            Static blocks can be used for various purposes, such as:

            Initializing static variables that require complex logic.
            Performing logging or debugging tasks.
            Loading native libraries or other resources.
            It's important to note that if a class has multiple static blocks, they are executed in the order they appear in the clas
        */

        // Static variable
        static int staticVariable;
    
        // Static block
        static {
            System.out.println("Static block is executed.");
            staticVariable = 10;  // Initialize the static variable
        }
    
        // Constructor
        public StaticBlock() {
            System.out.println("Constructor is executed.");
        }
    
        // Main method
        public static void main(String[] args) {
            System.out.println("Main method is executed.");
            System.out.println("Static variable: " + staticVariable);
    
            // Creating an instance of StaticBlock
            StaticBlock staticblock = new StaticBlock();
        }
    
    
    
}
