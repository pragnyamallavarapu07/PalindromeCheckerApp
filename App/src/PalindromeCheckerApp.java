
import java.util.Scanner;

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

        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("The text is a Palindrome.");
        } else {
            System.out.println("The text is NOT a Palindrome.");
        }

        sc.close();
    }
}