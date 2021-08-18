package pass;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NumberOfStudentsUnableToEatLunch {

    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for (int a : students) {
            queue.offer(a);
        }

        for (int i = sandwiches.length - 1; i >= 0; i--) {
            stack.push(sandwiches[i]);
        }

        while (!queue.isEmpty()) {

            int value = stack.peek();
            int student = queue.poll();
            boolean allSame = queue.isEmpty() ? true : same(queue, student);

            if (allSame && (value != student)) return queue.size() + 1;

            if (student == value) {
                stack.pop();
            } else {
                queue.offer(student);
            }
        }

        return 0;
    }

    boolean same(Queue<Integer> queue, int student) {
        int first = student;

        for (Integer integer : queue) {
            if (first != integer) return false;
        }
        return true;
    }
}
