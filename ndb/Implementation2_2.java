package ndb;

import java.util.Scanner;

public class Implementation2_2 {
    public static void main(String[] args) {
        // 나동빈님 풀이
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int row = input.charAt(1) - '0';
        int column = input.charAt(0) - 'a' + 1;

        // 나이트가 이동할 수 있는 8가지 방향
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        int count = 0;
        for (int i = 0; i < 8; i++) {
            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];

            if (nextRow > 0 && nextRow < 9 && nextColumn > 0 && nextColumn < 9){
                count++;
            }
        }
        System.out.println(count);
    }
}
