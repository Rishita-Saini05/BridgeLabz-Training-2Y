import java.util.*;
public class Area_Circle
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter radius = ");
        int radius = obj.nextInt();
        double area = 3.14*radius*radius;
        System.out.println("Area = " + area);


    }
}