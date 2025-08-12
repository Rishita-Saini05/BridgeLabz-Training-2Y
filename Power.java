import java.util.*;
public class Power
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print(" base no. = ");
        int b = obj.nextInt();
        System.out.print("Enter exponent = ");
        int e = obj.nextInt();
    
        double power = Math.pow(b,e);
        System.out.println("power = " +power);


    }
}