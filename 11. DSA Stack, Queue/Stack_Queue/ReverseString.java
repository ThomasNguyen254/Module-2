package Stack_Queue;

import java.util.Stack;

public class ReverseString {
    public static String reserveString(String input) {
        Stack<String> stack = new Stack<>();
        String[] words = input.split(" ");
        for (String word : words) {
            stack.push(word);
        }
        StringBuilder output = new StringBuilder();
        while (!stack.isEmpty()) {
            output.append(stack.pop()).append(" ");
        }
        return output.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Hello world!";
        String reserved = reserveString(input);
        System.out.println(reserved);
    }
}
