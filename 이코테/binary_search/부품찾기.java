package binary_search;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 부품찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] has = new int[n];
        for (int i = 0; i < n; i++) {
            has[i] = sc.nextInt();
        }
        sc.nextLine();
        int m = sc.nextInt();
        sc.nextLine();
        int[] need = new int[m];
        for (int i = 0; i < need.length; i++) {
            need[i] = sc.nextInt();
        }
        Arrays.sort(has);
        String[] answer = new String[m];

        for (int i = 0; i < need.length; i++) {

            int left = 0;
            int right = has.length - 1;

            int num = need[i];
            boolean hasNum = false;
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (has[mid] == num) {
                    hasNum = true;
                    break;
                }

                if (has[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (hasNum) {
                answer[i] = "yes";
            } else {
                answer[i] = "no";
            }
        }
        System.out.println(Arrays.stream(answer).collect(Collectors.joining(" ")));
    }
}
