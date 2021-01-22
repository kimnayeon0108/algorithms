package ndb;

import java.util.Arrays;
import java.util.Scanner;

public class NumCardGame1 {
    // 내 풀이 (96p 문제)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int[][] arr = new int[N][M];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = s.nextInt();
            }
        }

        // 행 별로 가장 낮은 숫자를 담은 배열
        int[] NArr = new int[N];

        for(int i = 0; i < N; i++){
            int[] newArr = new int[M];

            for(int j = 0; j < M; j++){
                // 각 행을 담은 배열
                newArr[j] = arr[i][j];
            }
            // 가장 낮은 숫자를 담아준다.
            Arrays.sort(newArr);
            NArr[i] = newArr[0];
        }
        Arrays.sort(NArr);
        System.out.println(NArr[NArr.length-1]);
    }
}
