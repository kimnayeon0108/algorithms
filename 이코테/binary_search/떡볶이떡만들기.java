package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class 떡볶이떡만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int length = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int left = 1;
        int right = arr[count - 1];
        int mid = 0;
        int result = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;

            if (cutAll(arr, mid) == length) {
                result = mid;
                break;
            }

            if (cutAll(arr, mid) > length) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(mid);
    }

    private static int cutAll(int[] arr, int cut) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - cut > 0) {
                sum += arr[i] - cut;
            }
        }
        return sum;
    }
}
