import java.util.*;
class Num
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        if(num==0){
            System.out.println("Zero");
        }
        else if(num<0){
            System.out.println("Negative");
        }
        else{
           System.out.println("Positive"); 
        }
        }
    }
