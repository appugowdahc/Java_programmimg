class InnerStaticVariable {

    static String  name = "Appu Gowda H C";

    
}

public class StaticVariable {

    public static void main(String[] args){
        /*
         * Static Variables in Java:-
         
            Static variables, also known as class variables, are variables that are 
            shared among all instances of a class. They are declared using the static 
            keyword and are stored in the class memory area, meaning there is only one 
            copy of the variable, regardless of how many instances of the class exist.
         
            Key Characteristics:

            --> Shared Among All Instances: All instances of a class share the same 
                static variable.
            
            --> Class-Level Variable: It belongs to the class rather than any particular
                object instance.
            
            --> Memory Allocation: Memory for static variables is allocated when the 
                class is loaded into memory, not when instances are created.
            
            -->Access Without Object: Static variables can be accessed directly using 
               the class name, without needing to create an instance of the class.
         
            Key Points:

                a. Single Copy: Only one copy of the static variable exists, and it is 
                   shared among all instances of the class.
                
                b.Class-Level Access: Static variables can be accessed without creating 
                  an instance of the class using the class name.
                c.Initialization: Static variables are initialized when the class is 
                  loaded into memory, before any instance is created.
                d. Memory Management: Static variables are stored in a special memory area
                 known as the method area or class area.
        */

        // static value accessing by object
        InnerStaticVariable st = new InnerStaticVariable();
        System.out.println("The static name by using object value is " + st.name);  // output --> Appu Gowda H C

        /* 
        when you  change static value of class or class object it is changing
        permanently for next class object alsoo get changed value 
        */
        st.name = "Manoj Gowda H C";


        // static value accessing by using class 
        System.out.println("The static value by directly accessing  " + InnerStaticVariable.name); // output --> Manoj Gowda H C ( because value reassigned in another abvove obj)

    }
    
}
