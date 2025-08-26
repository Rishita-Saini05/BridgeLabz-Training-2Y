import java.util.*;
class Natural
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if(n>=0){
            int sum = (n * (n+1)) / 2;
            System.out.println("The sum of "+n+" natural numbers is "+sum);
        }
        else{
            System.out.println("The number is not Natural number");
        }
    }
}