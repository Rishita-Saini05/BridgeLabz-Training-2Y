import java.util.*;
public class SI
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Principal amount = ");
        int p = obj.nextInt();
        System.out.print("Enter rate = ");
        int r = obj.nextInt();
        System.out.print("Enter time = ");
        int t = obj.nextInt();
        double SI = (p*r*t)/100;
        System.out.println("SI = " +SI);


    }
}