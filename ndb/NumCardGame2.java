package ndb;

import java.util.Scanner;

public class NumCardGame2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int result = 0;

        for(int i = 0; i < n; i++){
            // 해당 행에서 가장 작은 수 찾기
            int min_value = 1001;   // 입력 조건에서 입력 범위 10,000이하
            for(int j = 0; j < m; j++){
                int x = s.nextInt();
                min_value = Math.min(min_value,x);
            }
            // 가장 작은 수 들 중에서 가장 큰 수 찾기
            result = Math.max(result, min_value);
        }

    }
}
