package pass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);
        //  1. difference의 최소값 구하기
        int minDiff = 2000000;
        for (int i = 0; i < arr.length - 1; i++) {
            minDiff = Math.min(minDiff, arr[i + 1] - arr[i]);
        }

        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minDiff) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i + 1]);
                answer.add(list);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = minimumAbsDifference(new int[]{4, 2, 1, 3});
        list.forEach(l -> l.forEach(System.out::println));
    }
}
