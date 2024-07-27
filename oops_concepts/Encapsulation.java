package oops_concepts;

public class Encapsulation{
    private String name;
    private String email;
    private String password;

    // Correct setter for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Correct setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    /*

    Encapsulation in Java
        Encapsulation is one of the four fundamental principles of Object-Oriented 
        Programming (OOP) along with inheritance, polymorphism, and abstraction. It is 
        the technique of wrapping data (variables) and methods (functions) together as 
        a single unit. In encapsulation, the variables of a class will be hidden from 
        other classes and can be accessed only through the methods of their current class.

    Key Concepts:-

    --> Data Hiding: The internal state of the object is hidden from the outside world. 
            Only the object's methods can interact with this state.

    --> Access Control: Through encapsulation, you can control what data and methods are accessible from outside the class. This is typically done using access modifiers (private, protected, public).

    Benefits of Encapsulation:-

        1.Control of the Data: The encapsulated code is more flexible and easy to change 
            with new requirements.

        2.Increased Security: By hiding the implementation details, you protect the 
        integrity of the data and prevent external objects from changing it in unexpected ways.
        
        3.Reduced Complexity: It simplifies the interaction with the object by only 
        exposing necessary methods.
    
    Immutable Objects: 
        Encapsulation allows you to create immutable objects. By providing only getters 
        and no setters, you can ensure that the object's state cannot be changed once 
        it is created.
    */

    public static void main(String[] args) {

        System.out.println("HIIIIIIIIIIIIIIIII");
        Encapsulation obj = new Encapsulation();
        obj.setName("Appu Gowda H C");
        System.out.println("The name of the user is " + obj.getName());
    }
}
