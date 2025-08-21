import java.util.*;
class Height 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter h : ");
        int h = obj.nextInt();
        double inch = h/2.54;
        int feet = (int)(inch /12 );
        int rem = (int)(inch%12);
        System.out.println("Your Height in cm is "+ inch +" while in feet is "+feet+" and inches is "+rem);
        
    }
}