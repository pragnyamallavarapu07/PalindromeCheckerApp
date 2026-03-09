import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input text:");
        String input = sc.nextLine();

        // --- Stack Approach ---
        long startStack = System.nanoTime();
        boolean resultStack = checkWithStack(input);
        long endStack = System.nanoTime();

        // --- Two-Pointer Approach ---
        long startTwoPointer = System.nanoTime();
        boolean resultTwoPointer = checkWithTwoPointers(input);
        long endTwoPointer = System.nanoTime();

        // --- Recursion Approach ---
        long startRecursion = System.nanoTime();
        boolean resultRecursion = checkWithRecursion(input, 0, input.length() - 1);
        long endRecursion = System.nanoTime();

        // --- Display results ---
        System.out.println("\n=== Palindrome Check Results ===");
        System.out.printf("Stack Approach: %s (Time: %d ns)%n",
                resultStack ? "Palindrome" : "Not Palindrome", endStack - startStack);
        System.out.printf("Two-Pointer Approach: %s (Time: %d ns)%n",
                resultTwoPointer ? "Palindrome" : "Not Palindrome", endTwoPointer - startTwoPointer);
        System.out.printf("Recursion Approach: %s (Time: %d ns)%n",
                resultRecursion ? "Palindrome" : "Not Palindrome", endRecursion - startRecursion);

        sc.close();
    }

    // --- Stack Strategy ---
    public static boolean checkWithStack(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) stack.push(c);

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    // --- Two-Pointer Strategy ---
    public static boolean checkWithTwoPointers(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // --- Recursion Strategy ---
    public static boolean checkWithRecursion(String input, int start, int end) {
        if (start >= end) return true;
        if (input.charAt(start) != input.charAt(end)) return false;
        return checkWithRecursion(input, start + 1, end - 1);
    }
}