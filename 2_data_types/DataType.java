public class DataType{

    public static void main(String[] args){
        // integer data type values:
        byte num1 = 1;
        short num2 = 250;
        int num3 = 1000;
        long num4 = 102342048l;// at end of double type value we need to mention "l" 

        // float data type values: in java default float type is double
        float num5 = 4.908f; //in java you need to mention explicitly "f" at end of value 
        double num6 = 4.092730;

        // char data type: rule-> we must use single quotes to assign the value
        char s = 'a';
        
        //boolean data type
        boolean b = true;
        System.out.println("The byte value is "+num1);
        System.out.println("The short value is "+num2);
        System.out.println("The int value is "+num3);
        System.out.println("The long value is "+num4);

        System.out.println("The float value is "+num5);
        System.out.println("The double value is "+num6);
        System.out.println("The char value is "+s);
        System.out.println("The boolean value is "+b);


    }
}