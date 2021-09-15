package pass;

import java.util.HashSet;
import java.util.Set;

public class MaximumAscendingSubarraySum {
    public static int maxAscendingSum(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int sum = 0;
        boolean nextStart = false;
        for (int i = 0; i < nums.length; i++) {

            if (i != nums.length - 1 && nums[i] >= nums[i + 1]) {
                nextStart = true;
            } else {
                nextStart = false;
            }
            sum += nums[i];
            if (nextStart || i == nums.length - 1) {
                set.add(sum);
                sum = 0;
            }
        }

        return set.stream().mapToInt(Integer::intValue).max().getAsInt();
    }

    public static void main(String[] args) {
        maxAscendingSum(new int[]{10, 20, 30, 5, 10, 50});
    }
}
