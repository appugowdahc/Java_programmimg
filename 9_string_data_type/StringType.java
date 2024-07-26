public class StringType{

    public static void main(String[] args){
        
        /* this way you can initialize the string data type value */
        String nama = new String("Appu gowda H C");

        String name = "Appu";
        System.out.println("The name is "+ name);
        System.out.println("The name is "+ nama);

        StringBuffer sb = new StringBuffer("Appu Gowda H C ");

        sb.append("Hulivana");
        // to get capacity of string buffer
        System.out.println(sb.capacity());
        System.out.println("The string buffer value is "+ sb + sb.length());

        // to ensure minimum capacity
        sb.ensureCapacity(35);
        System.out.println("the minimum capacity after ensure capacity "+ sb.capacity());

        // to delete specific range characters
        sb.delete(0, 10);
        System.out.println("The sb value after deletion" + sb);

        //to reverse the sb value 
        sb.reverse();
        System.out.println("The sb value after reverse "+sb);

        // to convert stringuffer value to string 
        String str = sb.toString();
        System.out.println("The str value from string buffer "+ str );









    }
}