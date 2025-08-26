import java.util.Scanner;

public class Fact2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int fact = 1;
        if(n<0)
        System.out.println("negative no.");
        else{
            for(int i = n;i>0;i--)
            fact = fact*i;
            }      
              System.out.println("factorial = "+fact);


        }
    }
