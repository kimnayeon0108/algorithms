package pass;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    // 둘레 구하기
    // 가장 긴 변은 다른 두 변의 길이의 합보다 작다
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0;
    }
}
