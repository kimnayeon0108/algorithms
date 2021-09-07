package pass;

import java.util.Arrays;

public class 비밀지도 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        boolean[][] map1 = new boolean[n][n];
        boolean[][] map2 = new boolean[n][n];

        boolean[][] combine = new boolean[n][n];

        for (int i = 0; i < arr1.length; i++) {

            int num1 = arr1[i];
            String binary1 = "";
            while (num1 > 0) {
                binary1 = num1 % 2 + binary1;
                num1 = num1 / 2;
            }
            while (binary1.length() < n) {
                binary1 = "0" + binary1;
            }

            int num2 = arr2[i];
            String binary2 = "";
            while (num2 > 0) {
                binary2 = num2 % 2 + binary2;
                num2 /= 2;
            }
            while (binary2.length() < n) {
                binary2 = "0" + binary2;
            }


            for (int j = 0; j < n; j++) {
                if (binary1.charAt(j) == '1') {
                    map1[i][j] = true;
                } else {
                    map1[i][j] = false;
                }

                if (binary2.charAt(j) == '1') {
                    map2[i][j] = true;
                } else {
                    map2[i][j] = false;
                }
            }
        }

        String[] answer = new String[n];
        for (int i = 0; i < combine.length; i++) {
            String str = "";
            for (int j = 0; j < combine[i].length; j++) {
                combine[i][j] = map1[i][j] || map2[i][j];
                if (combine[i][j]) {
                    str += "#";
                } else {
                    str += " ";
                }
            }
            answer[i] = str;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] solution = solution(5, arr1, arr2);
        Arrays.stream(solution).forEach(System.out::println);
    }
}
