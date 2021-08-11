public class SingleNumber {

    // XOR 비트연산자를 이용한 풀이
    public static int singleNumber(int[] nums) {
        int answer = 0;

        for (int num : nums) {
            answer ^= num;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}
