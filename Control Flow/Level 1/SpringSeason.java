import java.util.*;

class SpringSeason {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter month: ");
        String month = obj.nextLine().toLowerCase();
        System.out.print("Enter day: ");
        int day = obj.nextInt();

        boolean isSpring = false;

        switch (month) {
            case "march":
                if (day >= 20 && day <= 31) {
                    isSpring = true;
                }
                break;
            case "april":
                if (day >= 1 && day <= 30) {
                    isSpring = true;
                }
                break;
            case "may":
                if (day >= 1 && day <= 31) {
                    isSpring = true;
                }
                break;
            case "june":
                if (day >= 1 && day <= 20) {
                    isSpring = true;
                }
                break;
            default:
                System.out.println("Invalid month");
                
        }

        if (isSpring) {
            System.out.println("It's Spring Season");
        } else {
            System.out.println("Wrong date");
        }
    }
}
