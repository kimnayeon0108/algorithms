package pass;

import java.util.Scanner;

public class BJ1032 {

    // 명령 프롬프트

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // 글자의 인덱스마다 boolean 값으로 체크해서 중복된 글자 찾기
        boolean[] bool = new boolean[arr[0].length()];
        for (int i = 0; i < bool.length; i++) {
            bool[i] = true;
        }
        String result = "";
        if (n == 1) {
            result = arr[0];
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr[0].length(); j++) {
                    if (arr[i].charAt(j) == arr[i + 1].charAt(j) && bool[j]) {
                        bool[j] = true;
                    } else {
                        bool[j] = false;
                    }
                }
            }

            for (int i = 0; i < bool.length; i++) {
                if (!bool[i]) {
                    result += "?";
                } else {
                    result += arr[0].charAt(i);
                }
            }

        }
        System.out.println(result);
    }
}
