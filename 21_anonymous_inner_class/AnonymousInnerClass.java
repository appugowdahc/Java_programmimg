class Person{
    public void showName(){
        System.out.println("This is Person class.... The person name is Appu");
    }
}

public class AnonymousInnerClass {

    public static void main(String[] args){

        /* creating anonymous class with help of any reference object we must use reference obj methods only  */
         
        Person p = new Person()
        {
            public void showName(){
                System.out.println("This is new anonymous class....");
            }
        };
        p.showName();
    }
}
