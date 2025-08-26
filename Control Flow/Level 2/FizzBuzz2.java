import java.util.*;
class FizzBuzz2
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        
        System.out.print("enter number : ");
        int num = obj.nextInt();
        int i = 1;
        while(i<=num){
            if(i%3==0 && i%5==0)
            System.out.println("FizzBuzz");

            else if(i%3==0)
            System.out.println("Fizz");
            else if(i%5==0){
            System.out.println("Buzz");

            }
            

            
            else
            System.out.println(i);
i++;

        }

    }
}