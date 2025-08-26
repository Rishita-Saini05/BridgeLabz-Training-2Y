import java.util.*;
class Largest
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n1 = obj.nextInt();
        int n2 = obj.nextInt();
        int n3 = obj.nextInt();

        if(n1>n2){
            if(n1>n3){
                System.out.println("Number 1 is largest");
            }
        }
        else{
            if(n2>n3)
            System.out.println("Number 2 is largest"); 
            else
            System.out.println("Number 3 is largest"); 
        }
    }
}        