import java.util.*;
class Smallest
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n1 = obj.nextInt();
        int n2 = obj.nextInt();
        int n3 = obj.nextInt();

        if(n1<n2){
            if(n1<n3){
                System.out.println("Yes the first number the smallest");
            }
        }
        else{
           System.out.println("No the first number the is not smallest"); 
        }
    }
}        