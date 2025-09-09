import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter str : ");
        String rev = "";
        String str = obj.nextLine();
        for(int i = str.length()-1;i>=0;i--){
            //System.out.print(str.charAt(i));
            rev = rev+str.charAt(i);
        }
        //System.out.println(rev);
        if(str.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
        System.out.println("not a Palindrome");
    }

}