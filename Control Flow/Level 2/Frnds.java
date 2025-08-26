import java.util.*;
class Frnds
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter age of amar");
        int n1 = obj.nextInt();
        System.out.println("enter age of akbar");
        int n2 = obj.nextInt();
        System.out.println("enter age of anthony");
        int n3 = obj.nextInt();
        System.out.println("enter height of amar");
        int h1 = obj.nextInt();
        System.out.println("enter height of akbar");
        int h2 = obj.nextInt();
        System.out.println("enter height of anthony");
        int h3 = obj.nextInt();

        if(n1<n2){
            if(n1<n3){
                System.out.println("amar is youngestt");
            }
        }
        else{
            if(n2<n3)
            System.out.println("akbar is youngest"); 
            else
            System.out.println("anthony is youngest"); 
        }
        

        if(h1>h2){
            if(h1>h3){
                System.out.println("amar is tallest");
            }
        }
        else{
            if(h2>h3)
            System.out.println("akbar is tallest"); 
            else
            System.out.println("anthony is tallest"); 
        }
    }

}        