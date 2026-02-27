import java.util.Scanner;

public class PalindromeCheckerApp {
/**
 * Application entry point
 *
 * This is a Java Palindrome Checker App Welcome Message
 *
 * @author Developer
 * @Version 1.0
 */
   public static void main(String[]args){
       Scanner sc =new Scanner(System.in);
       System.out.println("Input text :");
       String input =sc.nextLine();
       boolean isPalindrome;
       for (int i =0; i < input.length()/2; i++){

           if (input.charAt(i) != input.charAt(input.length() -1 -i)){
               isPalindrome =false;
               break;
           }
           else{
               isPalindrome =true;
               break;
           }
       }
       if(isPalindrome =true){
             System.out.println("is it a palindrome? :true");
       }
       else{
             System.out.println("s it a palindrome? :false");
       }
   }
}