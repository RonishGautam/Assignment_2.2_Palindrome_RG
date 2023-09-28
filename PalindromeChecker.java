import java.util.Stack;
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type a string to check if it's a palindrome:");
        String input = sc.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" it not a palindrome.");
        }
    }

    /**
     * Checks if the string is a palindrome or not.
     * 
     * 
     * @param str it check the string.
     * @return True if the string is a palindrome, and false if itsn't not .
     */
    
    public static boolean isPalindrome(String str) {
    	
        String cs = cleanString(str);
        Stack<Character> stacks = new Stack<>();
        
        for (char chare: cs.toCharArray()) {
            stacks.push(chare);
        }
        for (char ch : cs.toCharArray()) {
            if (ch != stacks.pop()) {
               return false;
            }
        }
        return true;
    }

    /**
     * Cleans the string by removing spaces, punctuation, and converting to lowercase.
     * @param str The string to clean.
     * @return The cleaned string.
     */
    public static String cleanString(String str)
{
        return str.replaceAll ("[^a-zA-Z]", "").toLowerCase();
    }
}
