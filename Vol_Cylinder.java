import java.util.*;
public class Vol_Cylinder
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter radius = ");
        int radius = obj.nextInt();
        System.out.print("Enter Height = ");
        int h = obj.nextInt();
        double Vol = 3.14*radius*radius*h;
        System.out.println("Vol = " + Vol);


    }
}