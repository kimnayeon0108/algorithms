package pass;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    // 배열로 다시 풀기
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[100001];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if(arr[i] == 0) {
                answer.add(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums2 = {2, 2};
        findDisappearedNumbers(nums2).forEach(System.out::println);
    }
}
