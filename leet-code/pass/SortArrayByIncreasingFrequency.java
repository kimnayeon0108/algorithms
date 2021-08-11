package pass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortArrayByIncreasingFrequency {

    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.isEmpty() || !map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                value = map.get(nums[i]);
                map.put(nums[i], ++value);
            }
        }

        int[] keys = map.keySet().stream()
                .sorted(Comparator.reverseOrder())
                .sorted(Comparator.comparing(a -> map.get(a)))
                .mapToInt(a -> a)
                .toArray();

        int[] answer = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < keys.length; i++) {
            for (int j = 0; j < map.get(keys[i]); j++) {
                answer[idx] = keys[i];
                idx++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = frequencySort(new int[]{1, 1, 2, 2, 2, 3});
        Arrays.stream(arr).forEach(System.out::println);
    }
}
