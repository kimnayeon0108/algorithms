package pass;

public class 소수만들기 {

    // 3개 숫자 더해서 소수가 되는 경우의 수
    public static int solution(int[] nums) {

        int result = 0;
        boolean isPrime = true;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    isPrime = true;

                    for (int z = 2; z < sum; z++) {
                        if (sum % z == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        result++;
                    }

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(solution(nums));
    }
}
