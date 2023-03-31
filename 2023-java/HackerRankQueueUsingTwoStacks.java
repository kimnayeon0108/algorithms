import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class HackerRankQueueUsingTwoStacks {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) throws IOException {
        // use 2 stacks to implement queue
        // print the result of third type query

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        for (int i = 0; i < num; i++) {
            String query = reader.readLine();
            executeQuery(query);
        }
    }

    private static void executeQuery(String query) {
        int queryNum;
        int argument = 0;

        if (query.length() != 1) {
            queryNum = 1;
            argument = Integer.parseInt(query.split(" ")[1]);
        } else {
            queryNum = Integer.parseInt(query);
        }

        if (queryNum == 1) {
            stack1.push(argument);
        } else if (queryNum == 2) {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            stack2.pop();   // first element delete
        } else {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            System.out.println(stack2.peek());   // print first element
        }
    }
}
