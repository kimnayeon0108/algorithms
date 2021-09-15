package pass;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingSomeElements {

    // remove smallest 5%, largest 5%
    // 남은 요소의 평균 값
    public static double trimMean(int[] arr) {

        Arrays.sort(arr);
        int len = arr.length * 5 / 100;
        int[] copy = Arrays.copyOfRange(arr, len, arr.length - len -1);
        int sum = Arrays.stream(copy).sum();
        return (double) sum / copy.length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        System.out.println(Arrays.stream(arr).sum());
        trimMean(arr);
    }
}
