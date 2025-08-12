import java.util.*;
public class C_to_F
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter temp in celcius = ");
        int temp = obj.nextInt();
        //Fahrenheit = (Celsius * 9/5) + 32.
        int F = (temp * 9/5)+32;
        System.out.println("temp in fahrenheit  = " + F);


    }
}