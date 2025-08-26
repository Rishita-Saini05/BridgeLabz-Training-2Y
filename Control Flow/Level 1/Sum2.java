import java.util.*;
class Sum2
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        double total = 0.0;

        
        while(true){
            double n = obj.nextDouble();
            if(n==0 || n<0)
            break;
            else
            total =total+n;
            
            
        }
    System.out.println(total);  
    }
}
