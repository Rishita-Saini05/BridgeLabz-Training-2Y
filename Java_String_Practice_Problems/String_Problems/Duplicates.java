import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter str: ");
        String str = obj.nextLine();
        
        String o = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int c = 0;
            for (int j = 0; j < o.length(); j++) {
                if (ch == o.charAt(j)) {
                    c = 1;
                    break;
                }
            }
            if (c == 0) {
                o = o + ch;
            }
        }

        System.out.println("String after removing duplicates: " + o);
        obj.close();
    }
}
