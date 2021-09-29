package dp;

import java.util.Scanner;

public class 개미전사 {
    // 창고마다 최대로 얻을 수 있는 값
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] save = new int[num];
        save[0] = arr[0];
        save[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < num; i++) {
            save[i] = Math.max(save[i - 1], save[i - 2] + arr[i]);
        }

        System.out.println(save[num - 1]);
    }
}
