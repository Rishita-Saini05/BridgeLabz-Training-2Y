import java.util.*;
public class Substring {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter str : ");

        String str = obj.nextLine();
        System.out.print("enter substr : ");

        String substr = obj.nextLine();

        String[] words = str.split("\\s+");
        int c = 0;
        for( String word : words) {
            if (word.equals(substr)){
                c++;
            }
        }
        System.out.println("substring occurs "+c+ " times");
    }
}