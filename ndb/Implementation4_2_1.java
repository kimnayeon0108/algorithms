package ndb;

import java.util.Scanner;

public class Implementation4_2_1 {
    // 내 풀이
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 60; j++) {
                for (int z = 0; z < 60; z++) {
                    boolean strI = String.valueOf(i).contains("3");
                    boolean strJ = String.valueOf(j).contains("3");
                    boolean strZ = String.valueOf(z).contains("3");
                    if (strI || strJ || strZ) result++;
                }
            }
        }
        System.out.println(result);
    }
}
