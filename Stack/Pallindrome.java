package Stack;

import java.util.Stack;

public class Pallindrome {

    public boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();

        // Push all characters into the stack
        for (char ch : s.toCharArray()) {
            stack.push(ch);
        }

        // Check for palindrome
        for (char ch : s.toCharArray()) {
            if (stack.pop() != ch) {
                return false; // Mismatch found
            }
        }

        return true; // All matched
    }

    public static void main(String[] args) {
        Pallindrome sol = new Pallindrome();

        System.out.println(sol.isPalindrome("madam"));    // true
        System.out.println(sol.isPalindrome("racecar"));  // true
        System.out.println(sol.isPalindrome("hello"));    // false
        System.out.println(sol.isPalindrome("noon"));     // true
    }
}