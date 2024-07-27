class OuterClass{
    String  name = "Appu Gowda H C";

    public void showName(){
        
        // this.name = name;
        System.out.println("The name is "+this.name);
    
    }

    class Inner{
        int age = 25;

        public void showAge(){
            System.out.println("I am 25 years old now.");
        }
    }
}


public class InnerClass {

    public static void main(String[] args){

        OuterClass out_obj = new OuterClass();
        out_obj.showName();

        /*
         if you want to access inner class from outer class
         */
        OuterClass.Inner inner_obj = out_obj.new Inner();
        inner_obj.showAge();



    }
    
}
