import java.util.*;
class CountDown
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        while(n>=1){
            System.out.println(n);
            n--;
        }
    }
}