package ndb;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BigNumber1 {
    // 내 방식대로 푼 풀이
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int K = s.nextInt();
        s.nextLine();
        Integer[] nums = new Integer[N];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }
        Arrays.sort(nums, Collections.reverseOrder());
        int result = 0;
        for(int i = 0; i < M; i++){
            for(int j = 0; j < K; j++){
                result += nums[0];
            }
            result += nums[1];
            M = M - K;
            continue;
        }
        System.out.println(result);
    }
}
