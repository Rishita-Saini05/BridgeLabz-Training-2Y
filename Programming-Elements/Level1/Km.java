import java.util.*;
class Km
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        double km = obj.nextDouble();
        double mile = 0.6*km;
        System.out.println("The total miles is"+mile+" mile for the given "+km +"Km");
    }
}