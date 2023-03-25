package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();


        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            stack.push(c);
            queue.add(c);
        }

        while (!queue.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "Able was I ere I saw Elba";
        if (isPalindrome(word)) {
            System.out.println(word + "is Palindrome ");
        } else {
            System.out.println(word + "is not Palindrome");
        }
    }
}
