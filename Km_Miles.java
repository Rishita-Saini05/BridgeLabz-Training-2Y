import java.util.*;
public class Km_Miles
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter KM = ");
        int Km = obj.nextInt();
        //Miles = Kilometers * 0.621371.
        double Miles = Km * 0.621371;
        System.out.println("Miles  = " + Miles);


    }
}