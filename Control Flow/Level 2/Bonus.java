import java.util.*;
class Bonus
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter salary : ");
        int salary = obj.nextInt();
        System.out.print("enter year of service : ");
        int year = obj.nextInt();
        if(year>5){
            int bonus = (5*salary)/100;
            System.out.println("Bonus : "+bonus);
        }
        else{
            System.out.println("no bonus");
        }
    }
}