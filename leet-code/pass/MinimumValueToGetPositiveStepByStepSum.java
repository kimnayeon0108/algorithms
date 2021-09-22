package pass;

public class MinimumValueToGetPositiveStepByStepSum {
    // minimum startValue, positive
    public int minStartValue(int[] nums) {
        int start = 1;
        while (true){
            int sum = start;
            boolean gtOne = true;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if(sum < 1){
                    gtOne = false;
                    break;
                }
            }
            if(gtOne) {
                return start;
            }
            start++;
        }
    }

    public static void main(String[] args) {
        MinimumValueToGetPositiveStepByStepSum m = new MinimumValueToGetPositiveStepByStepSum();
        int[] nums = {-3, 2, -3, 4, 2};
        m.minStartValue(nums);
    }
}
