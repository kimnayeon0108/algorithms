package pass;

import java.util.ArrayList;
import java.util.List;

public class FindLuckyIntegerInAnArray {

    public static int findLucky(int[] arr) {

        int[] frequency = new int[501];
        List<Integer> luckyNums = new ArrayList<>();

        for (int i : arr) {
            frequency[i]++;
        }

        for (int i : frequency) {
            if (frequency[i] != 0 && i == frequency[i]) {
                luckyNums.add(i);
            }
        }

        return luckyNums.size() == 0 ? -1 : luckyNums.stream().mapToInt(Integer::intValue).max().getAsInt();
    }

    public static void main(String[] args) {
        findLucky(new int[]{2, 2, 3, 4});
    }
}
