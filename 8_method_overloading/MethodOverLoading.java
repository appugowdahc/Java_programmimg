class AddTwoNums{
    
    public int add(int x,int y){
        return x+y;
    }
    public double add(double x,int y){
        return x+y;
    }
    public int add(int x,int y,int i){
        return x+y+i;
    }
}

public class MethodOverLoading{

    public static void main(String[] args){
            AddTwoNums obj = new AddTwoNums();
            int res = obj.add(2,3);
            System.out.println(res);

            double res1 = obj.add(2.4,4);
            System.out.println(res1);
    }
}