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

        LinkedList<Character> list = new LinkedList<>();


        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;


        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The text is a Palindrome.");
        } else {
            System.out.println("The text is NOT a Palindrome.");
        }

        sc.close();
    }
}