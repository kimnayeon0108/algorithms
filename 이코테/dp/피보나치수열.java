package dp;

import java.util.Scanner;

public class 피보나치수열 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long[] arr = new long[1001];

        arr[0] = 0;
        arr[1] = 1;
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(arr[num]);

    }
}
