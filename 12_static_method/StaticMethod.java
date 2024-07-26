class AllStatics{

    //access within the package or file
    static void printName(){
        System.out.println("Hi, I am Appu Gowda H C");
    }
    
    //access outside the package
    public static void printAge(){

        System.out.println("MY age is 25 years");

    }
    // instance method
    public void myDetails(){
        System.out.println("My name is Appu, i am 25 yrs old, i am living in bangalore.");
    }
}


public class StaticMethod {

    public static void main(String[] args) {
        // directly we access static methods without creating objects
        AllStatics.printName();
        AllStatics.printAge();

        // access instance objects by creating or instantiating obj
        AllStatics obj = new AllStatics();
        obj.myDetails();
        

    }
    
}
