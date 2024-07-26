public class SwitchAndTernary{

    public static void main(String[] args){
        //ternary code
        int n = 10;
        int res = 0;
        res = n%10 ==0?100:00;
        System.out.println("The res value for current number is "+res);

        //switch code
        int day = 1;

        switch (day){
            case 1:
                System.out.println("Today is Monday.");
                break;
            case 2:
                System.out.println("Today is Tuesday.");
                break;
            case 3:
                System.out.println("Today is Wednesday.");
                break;
            case 4:
                System.out.println("Today is Thursday.");
                break;
            case 5:
                System.out.println("Today is Friday.");
                break;
            case 6:
                System.out.println("Today is Saturday.");
                break;
            case 7:
                System.out.println("Today is Sunday.");
                break;
            default:
                System.out.println("Enter the valid number:");
                break;
            }
    }
}