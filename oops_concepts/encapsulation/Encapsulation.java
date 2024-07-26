package oops_concepts.encapsulation;

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

    public static void main(String[] args) {
        System.out.println("HIIIIIIIIIIIIIIIII");
        // Encapsulation obj = new Encapsulation();
        // obj.setName("Appu Gowda H C");
        // System.out.println("The name of the user is " + obj.getName());
    }
}
