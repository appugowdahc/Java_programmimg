public class BoxingAndUnboxing{

    public static void main(String[] args){

        int num1 = 8;

        /* int type is primitive data type it is not object, to store in object we need 
        to use Integer obj this is called boxing and this method is deprecated */

        Integer num2 = new Integer(num1); // --> this method called boxing

        /*you can directly assign the value to Integer obj instead new Integer() and it
         is automatically convert Integer obj this is called autoboxing
         */
        Integer num3 = num1; // --> auto boxing

        /* if you want to get int value from Integer obj you can use obj.intValue() method */
        int num4 = num3.intValue(); // --> this called unboxing

        /*we can direct assign Integer obj to int, it will take care automatically */
        int num5 = num3; // --> auto unboxing

        String s = "18";

        /*if you get int value or convert string to int value use Integer obj */

        int num6 = Integer.parseInt(s); //to convert string to int


    }
}