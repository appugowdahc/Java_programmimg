abstract class InnerAbstractInnerClass {

    abstract void showName();

    
}

class InnerClass extends InnerAbstractInnerClass{

    public void showName(){
        System.out.println("This is inner class...");
    }

}

public class AbstractInnerClass {

    public static void  main(String[] args){

        /* we can not use abstact class or method for initializinig obj but we use for
         creating anonymouse class
         */
        InnerAbstractInnerClass obj = new InnerAbstractInnerClass(){
            public void showName(){
                System.out.println(" This is anonymous class...");
            }
        };
        obj.showName();
        

    }
    
}
