import java.util.*;
class OddEven
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if(n<1)
        System.out.println("not a natural no.");
        else {
            for (int i = 1;i<=n;i++){
                if(i%2!=0){
                System.out.println("odd:"+i);   
                }
                else
                System.out.println("even:"+i);
            }
        }
    }
}