package pass;

import java.util.ArrayList;
import java.util.List;

public class PickToAndSum {

    public static int[] solution(int[] numbers) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }

        return list.stream().sorted().distinct().mapToInt(a -> a).toArray();
    }

    public static void main(String[] args) {
        int[] arr = solution(new int[]{2, 1, 3, 4, 1});
    }
}
