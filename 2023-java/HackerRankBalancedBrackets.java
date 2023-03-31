import java.util.Stack;

public class HackerRankBalancedBrackets {
    public static String isBalanced(String s) {
        // Write your code here
        Character char1 = '}';
        Character char2 = ')';
        Character char3 = ']';

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty()) {
                if ((s.charAt(i) == char1 && stack.peek() == '{') || (s.charAt(i) == char2 && stack.peek() == '(') || (s.charAt(i) == char3 && stack.peek() == '[')) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            } else {
                stack.push(s.charAt(i));
            }
        }

        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
