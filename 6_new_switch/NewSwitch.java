public class NewSwitch{

    public static void main(String[] args){
        int day = 1;
        String res = "null";
        
        // in java 14 version onwards switch can be use like below 
        switch (day){
            case 1 -> System.out.println("Today is Monday.");
            case 2 -> System.out.println("Today is Tuesday.");
            default -> System.out.println("Not valid number");
        }
        
        switch (day){
            case 1 -> res = "Monday";
            case 2 -> res = "Tuesday";
            default -> res = "Not valid number";
        }
        System.out.println("Second day  is " + res);
        
        res = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Not valid number";
        };
        System.out.println("Final day is "+ res);
    }
}