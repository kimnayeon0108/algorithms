package pass;

import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveAllAdjacentDuplicatesInString {

    // 연속된 중복된 문자를 지워라, 더이상 지울게 없을때 까지 진행한다.
    // 처음에 time limit exceeded가 떴다가 stack으로 푼 것에 아이디어를 얻어서 품
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack();
        stack.push(s.charAt(0));

        // stack에 첫 글자 넣고,
        // stack의 맨 위 글자랑(peek) 현재 글자 확인해서,
        // 글자가 같으면 맨위 글자 pop하고, 현재 글자 push 하지 않는다.
        // 글자가 다르면 현재 글자 push
        for (int i = 1; i < s.length(); i++) {

            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else if(stack.peek().equals(s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.stream().map(c -> c.toString()).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("aaaaaaa"));
    }
}
