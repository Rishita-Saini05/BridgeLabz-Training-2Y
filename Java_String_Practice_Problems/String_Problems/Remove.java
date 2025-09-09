import java.util.*;

public class Remove {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("enter str : ");
        String str = obj.nextLine();

        System.out.print("enter char : ");
        char chr = obj.nextLine().charAt(0);

        
        str = str.replace(Character.toString(chr), "");

        System.out.println("Updated string: " + str);
    }
}
