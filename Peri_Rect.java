import java.util.*;
public class Peri_Rect
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print(" Enter length = ");
        int l = obj.nextInt();
        System.out.print("Enter Breadth = ");
        int b = obj.nextInt();
    
        int peri = 2*(l+b);
        System.out.println("Perimeter = " +peri);


    }
}