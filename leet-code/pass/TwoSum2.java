package pass;

public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {

        int idx = 0;
        for (int i = 0; i < numbers.length; i++) {
            idx = i;
            if (numbers[i] > target) {
                break;
            }
        }

        for (int i = 0; i <= idx - 1; i++) {
            for (int j = i + 1; j <= idx; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        twoSum(arr, 6);
    }
}
