import java.util.*;
class Div_5
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if(n%5==0){
            System.out.println("Divisible by 5");
        }
        else {
            System.out.println("Not Divisible by 5");
        }
    }
}
