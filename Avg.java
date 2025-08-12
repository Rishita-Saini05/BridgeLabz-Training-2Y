import java.util.*;
public class Avg
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter no. 1 = ");
        int p = obj.nextInt();
        System.out.print("Enter no. 2 = ");
        int r = obj.nextInt();
        System.out.print("Enter no. 3 = ");
        int t = obj.nextInt();
        double Avg = (p+r+t)/3;
        System.out.println("avg = " +Avg);


    }
}