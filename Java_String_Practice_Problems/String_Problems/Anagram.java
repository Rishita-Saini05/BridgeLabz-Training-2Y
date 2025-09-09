import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String str1 = obj.nextLine();

        System.out.print("Enter second word: ");
        String str2 = obj.nextLine();

        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not an Anagram");
            return;
        }

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }
}
