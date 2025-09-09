import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter str : ");

        String str = obj.nextLine();
        for(int i = str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}