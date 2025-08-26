import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int fact = 1;
        if(n<0)
        System.out.println("negative no.");
        else{
            while(n>0){
              fact = fact * n;
              n--;  
            }
        }
        System.out.println("factorial = "+fact);
    }
}