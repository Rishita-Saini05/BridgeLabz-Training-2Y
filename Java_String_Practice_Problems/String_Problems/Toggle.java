import java.util.*;

public class Toggle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter str : ");

        String str = obj.nextLine();
        String toggledStr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                toggledStr += (char)(ch - 32); 
            } else if (ch >= 'A' && ch <= 'Z') {
                toggledStr += (char)(ch + 32); 
            } else {
                toggledStr += ch; 
            }
        }

        System.out.println("Togglecase: " + toggledStr);
    }
}
