import java.util.Scanner;

public class FrequentChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int maxCount = 0;
        char mostFrequent = ' ';

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            int count = 0;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == current) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = current;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
