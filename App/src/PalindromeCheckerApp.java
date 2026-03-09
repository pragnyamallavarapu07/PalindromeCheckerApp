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

        PalindromeStrategy strategy = new StackStrategy();
        boolean result = strategy.check(input);

        if (result) {
            System.out.println("The text is a Palindrome.");
        } else {
            System.out.println("The text is NOT a Palindrome.");
        }

        sc.close();
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}