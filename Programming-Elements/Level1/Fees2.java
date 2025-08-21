import java.util.*;
class Fees2
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter fees : ");
        int fee = obj.nextInt();
        System.out.print("enter dis : ");
        int dp = obj.nextInt();
        int discount = (fee * dp)/100;
        int dis_fee= fee - discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR"+dis_fee);
    }
}