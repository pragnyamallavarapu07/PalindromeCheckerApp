import java.util.*;

public class PalindromeCheckerApp {

    /**
     * Application entry point
     * This is a Java Palindrome Checker App
     * @author Developer
     * @version 1.0
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input text:");
        String input = sc.nextLine();

        PalindromeService service = new PalindromeService();
        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println("The text is a Palindrome.");
        } else {
            System.out.println("The text is NOT a Palindrome.");
        }

        sc.close();
    }
}

class PalindromeService {

    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}