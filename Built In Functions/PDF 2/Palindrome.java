import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        String input = getInput();
        boolean isPalindrome = checkPalindrome(input);
        displayResult(input, isPalindrome);
    }

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        return scanner.nextLine().replaceAll("[\\W_]", "").toLowerCase();
        // removes non-alphanumeric characters and converts to lowercase
    }

    public static boolean checkPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void displayResult(String original, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("'" + original + "' is a palindrome.");
        } else {
            System.out.println("'" + original + "' is not a palindrome.");
        }
    }
}
