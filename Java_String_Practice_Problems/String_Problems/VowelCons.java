import java.util.*;
public class VowelCons {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter str : ");

        String str = obj.nextLine();
        int countvow = 0, countcons = 0;

        str = str.toLowerCase(); 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') { 
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    countvow++;
                } else {
                    countcons++;
                }
            }
        }

        System.out.println("vowels: " + countvow);
        System.out.println("consonants: " + countcons);
    }
}
