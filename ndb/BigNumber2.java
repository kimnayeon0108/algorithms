package ndb;

import java.util.Arrays;
import java.util.Scanner;

public class BigNumber2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int K = s.nextInt();
        s.nextLine();
        int[] nums = new int[N];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }
        Arrays.sort(nums);
        int first = nums[N - 1];    // 가장 큰 수
        int second = nums[N - 2];   // 두번째로 큰 수

        // 가장 큰 수가 더해지는 횟수 구하기
        int count = M / (K + 1) * K;
        count += M % (K + 1);

        int result = 0;
        result += first * count;    // 가장 큰 수 더하기
        result += second * (M - count); // 두번째로 큰 수 더하기
        System.out.println(result);
    }
}
