
public class DefaultAndParametersConstructure {

    public String name;

    // this is default connstructer
    public DefaultAndParametersConstructure(){
        System.out.println("The default constructer is initializing.........");
    }

    // parameterised Constructer
    public DefaultAndParametersConstructure(String name){
        System.out.println("The parameterised constructor is initializing....");
        this.name = name;
        System.out.println("The name is "+ this.name);
        
    }
    public static void main(String[] args){
        DefaultAndParametersConstructure obj = new DefaultAndParametersConstructure();
        DefaultAndParametersConstructure obj1 = new DefaultAndParametersConstructure("Appu gowda H C");

    }

}
