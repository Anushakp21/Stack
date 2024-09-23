package stack;

import java.util.Stack;

public class NextGreaterElement {

    public static int[] findNextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] nextGreater = findNextGreater(arr);

        System.out.println("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nNext Greater Elements: ");
        for (int num : nextGreater) {
            System.out.print(num + " ");
        }
    }
}

