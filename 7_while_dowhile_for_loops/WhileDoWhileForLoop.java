public class WhileDoWhileForLoop{

    public static void main(String[] args){
        // while loop example
        int i = 1;
        while(i<5){
            System.out.println("I am in the " + i + "th room.");
            i++; //++i these loo
        }

        // do while code
        int x = 5;
        do{
            System.out.println("I am in the " + i + "th house.");
        }while(x<5);
        
        //for loop
        // int y = 0;
        for(int y=1;y<5;y++){
            System.out.println("You are in the " + y + "th building.");
        }
    }
}