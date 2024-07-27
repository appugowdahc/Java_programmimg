class Example {
    int number;

    Example(int number) {
        this.number = number; // 'this.number' refers to the instance variable, 'number' refers to the parameter
    }

    void display() {
        System.out.println(this.number);
    }
}
class Example1 {
    int number;
    String text;

    Example1(int number) {
        this(number, "Default Text"); // Calls the constructor with two parameters
    }

    Example1(int number, String text) {
        this.number = number;
        this.text = text;
    }

    void display() {
        System.out.println(this.number + " " + this.text);
    }
}




public class This {
    /*
    -:this Keyword :-
        The this keyword refers to the current instance of the class. It is commonly 
        used to:

            1. Refer to instance variables when they are shadowed by method parameters or local variables.
            2. Invoke other constructors in the same class.
            3. Pass the current instance as an argument to a method or constructor.
     */
    public static void main(String[] args) {
        Example ex = new Example(10);
        ex.display(); // Outputs: 10
        
        Example1 ex1 = new Example1(10);
        ex1.display(); // Outputs: 10 Default Text
    }
}
