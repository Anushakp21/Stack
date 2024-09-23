package stack;

import java.util.Stack;

public class SortStack {

    public static Stack<Integer> sort(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return stack;
        }
        int top = stack.pop();
        sort(stack);
        sortedInsert(stack, top);
        return stack;
    }

    private static void sortedInsert(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        sortedInsert(stack, element);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);

        System.out.println("Original Stack: " + stack);
        sort(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}

