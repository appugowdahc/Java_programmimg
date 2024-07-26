
public class StringBufferAndStringBuilder {
    public   void stringBufferMethod(){
            
    
    /* 
     * StringBuffer is a class in Java that is used to create mutable 
     * (modifiable) strings. Unlike the String class, whose objects are 
     * immutable (cannot be changed once created), StringBuffer allows you to 
     * modify the string content without creating new objects. This can be more
     *  efficient in terms of memory and performance when performing numerous 
     * string manipulations.
     * 
     * 
     * Key Characteristics:
        Mutable: The content of StringBuffer objects can be changed after they are created.
        Thread-Safe: Methods of StringBuffer are synchronized, which means it is safe to use StringBuffer in multi-threaded environments.
        Efficiency: StringBuffer is more efficient than String when you need to perform many modifications to the string content, such as appending, inserting, or deleting characters.
      
        Constructors:
        StringBuffer(): Creates an empty StringBuffer with an initial capacity of 16 characters.
        StringBuffer(int capacity): Creates an empty StringBuffer with the specified initial capacity.
        StringBuffer(String str): Creates a StringBuffer with the specified string content.
        StringBuffer(CharSequence seq): Creates a StringBuffer that contains the same characters as the specified CharSequence.

     */


     // we create empty string buffer value
     StringBuffer sb1 = new StringBuffer();
     System.out.println(sb1); // output --> ""
     
     // to create string buffer value you must use StringBuffer method()
     StringBuffer sb = new StringBuffer("appu");

     // to add or append value to the sb variable
     sb.append(" gowda");

     System.out.println("string value after appending --> " + sb); // output --> appu gowda

     // insert value at particular position
     sb.insert(10, " H C");
     System.out.println("value after inserting is --> " + sb);

     // replacing the value at specific position
     sb.replace(0, 1,"A");
     System.out.println("value after replacing a to A --> " + sb);
     // check string buffer capacity
     int capacity = sb.capacity();
     System.out.println(" the sb capacity is --> " + capacity);


     // we can reverse the string buffer value
     sb.reverse();
     System.out.println("The value after reversing is  --> "+sb);
     sb.reverse();

     // Deleting text
     sb.delete(5, 13);
     System.out.println("After delete: --> " + sb);

     // Getting length
     int length = sb.length();
     System.out.println("Length: " + length);

        
    }
    public  void stringBuilderMethod(){

        /*
         StringBuilder in Java
            StringBuilder is a class in Java used for creating and manipulating mutable strings. It is very similar to StringBuffer but is not synchronized, meaning it is not thread-safe. This makes StringBuilder more efficient than StringBuffer in a single-threaded environment where thread safety is not a concern.

            Key Characteristics:

            Mutable: The content of StringBuilder objects can be changed after they are created.
            Not Thread-Safe: Unlike StringBuffer, StringBuilder is not synchronized and hence not safe to use in a multi-threaded environment without external synchronization.
            Efficiency: StringBuilder is faster than StringBuffer due to the lack of synchronization overhead

            Constructors:

            StringBuilder(): Creates an empty StringBuilder with an initial capacity of 16 characters.
            StringBuilder(int capacity): Creates an empty StringBuilder with the specified initial capacity.
            StringBuilder(String str): Creates a StringBuilder with the specified string content.
            StringBuilder(CharSequence seq): Creates a StringBuilder that contains the same characters as the specified CharSequence. 
         
         */
        // Creating a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        
        // Appending text
        sb.append(" World");
        System.out.println("After append: " + sb);
        
        // Inserting text
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);
        
        // Replacing text
        sb.replace(5, 10, "Everyone");
        System.out.println("After replace: " + sb);
        
        // Deleting text
        sb.delete(5, 13);
        System.out.println("After delete: " + sb);
        
        // Reversing text
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
        // Getting length
        int length = sb.length();
        System.out.println("Length: " + length);
        
        // Getting capacity
        int capacity = sb.capacity();
        System.out.println("Capacity: " + capacity);
        
        // Setting length
        sb.setLength(5);
        System.out.println("After setLength: " + sb);

    }
    public static void main(String[] args){
        StringBufferAndStringBuilder sdObj = new StringBufferAndStringBuilder();
        sdObj.stringBufferMethod();
        sdObj.stringBuilderMethod();
        

    }
}
