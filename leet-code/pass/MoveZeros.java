package pass;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        // 내풀이
        int backIdx = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            backIdx = i + 1;
            if (nums[i] == 0) {
                while (backIdx < nums.length - 1) {
                    if (nums[backIdx] != 0) {
                        break;
                    }

                    backIdx++;
                }
                int temp = nums[backIdx];
                nums[backIdx] = nums[i];
                nums[i] = temp;
            }
        }
    }

    public static void anotherSolution(int[] nums) {
        // 모범답안
        int idx = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[idx] = num;
                idx++;
            }
        }
        for (int i = idx; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        anotherSolution(nums);
        Arrays.stream(nums).forEach(System.out::println);

    }
}
