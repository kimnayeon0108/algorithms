import java.util.*;
import java.util.stream.Collectors;

public class HackerRankJesseAndCookies {
    public static int cookies(int k, List<Integer> A) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();       // 정렬
        queue.addAll(A);

        int count = 0;
        while (queue.peek() < k && queue.size() >= 2) {
            int a = queue.poll();
            int b = queue.poll();
            int sum = a+b*2;
            queue.add(sum);
            count++;
        }
        if (queue.peek() < k) {
            return -1;
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        list.add(13);
//        list.add(47);
//        list.add(74);
//        list.add(12);
//        list.add(89);
//        list.add(74);
//        list.add(18);
//        list.add(38);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(10);
        list.add(12);

        System.out.println(cookies(7, list));
    }
}
