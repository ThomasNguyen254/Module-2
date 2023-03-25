package Stack_Queue;

import java.util.Stack;

public class ReverseArrayWithStack {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
