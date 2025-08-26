import java.util.*;
class Table
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter number : ");
        int num = obj.nextInt();
        
        if(num>=6 && num<=9){
        for(int i = 1;i<11;i++){
            System.out.print(num+"*"+i+"=");
            System.out.println(num*i);
        }
    }
    else
    System.out.println("no. is not b/w 6 and 9");
    }
}
