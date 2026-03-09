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

        boolean result = check(input, 0, input.length() - 1);

        if (result) {
            System.out.println("The text is a Palindrome.");
        } else {
            System.out.println("The text is NOT a Palindrome.");
        }

        sc.close();
    }

    // Recursive method
    private static boolean check(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return check(s, start + 1, end - 1);
    }
}