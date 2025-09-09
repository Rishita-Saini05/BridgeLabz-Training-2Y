import java.util.*;
public class Word {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter str : ");

        String str = obj.nextLine();
        String[] words = str.split("\\s+");
        String Longestword="";
        for( String word : words) {
            if (word.length()>Longestword.length()){
                Longestword = word;
            }
        }
        System.out.println("Longest word : "+Longestword);
    }
}