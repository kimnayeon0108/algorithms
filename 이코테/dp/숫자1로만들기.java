package dp;

import java.util.Scanner;

public class 숫자1로만들기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] save = new int[30001];

        for (int i = 2; i <= num; i++) {
            save[i] = save[i - 1] + 1;

            if(i % 2 == 0) save[i] = Math.min(save[i/2] + 1, save[i]);

            if(i % 3 == 0) save[i] = Math.min(save[i/3]+1, save[i]);

            if(i % 5 ==0 ) save[i] = Math.min(save[i/5]+1, save[i]);
        }

        System.out.println(save[num]);
    }
}
