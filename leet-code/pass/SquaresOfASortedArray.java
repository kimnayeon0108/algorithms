package pass;

import java.util.Arrays;

public class SquaresOfASortedArray {
    // 977번

    // 제곱해서 오름차순 정렬하기
    public static int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums)
                .map(a -> (int) Math.pow(a, 2))
                .sorted()
                .toArray();
    }

    public static void main(String[] args) {
        int[] array = sortedSquares(new int[]{-4, -1, 0, 3, 10});
        Arrays.stream(array).forEach(System.out::println);
    }
}
