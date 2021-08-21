package pass;

import java.util.Stack;

public class HateSameNum {

    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() == arr[i]) {
                continue;
            } else {
                stack.push(arr[i]);
            }
        }

        return stack.stream().mapToInt(a -> a).toArray();
    }
}
