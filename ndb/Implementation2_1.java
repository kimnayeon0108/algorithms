package ndb;

import java.util.Scanner;

public class Implementation2_1 {
    public static void main(String[] args) {
        // 왕실이 나이트 내코드
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int x = input.charAt(0) - 96;
        int y = Integer.parseInt(input.substring(1));
        int count = 0;

        int[] xMove = {x + 2, x - 2, x + 1, x - 1};
        int[] yMove = {y + 1, y - 1, y + 2, y - 2};

        // 8가지 경우를 다 적는건가..?
        if ((xMove[0] > 0 && xMove[0] < 9)) {
            if (yMove[0] > 0 && yMove[0] < 9) count++;
            if (yMove[1] > 0 && yMove[1] < 9) count++;
        }
        if ((xMove[1] > 0 && xMove[1] < 9)) {
            if (yMove[0] > 0 && yMove[0] < 9) count++;
            if (yMove[1] > 0 && yMove[1] < 9) count++;
        }
        if ((xMove[2] > 0 && xMove[2] < 9)) {
            if (yMove[2] > 0 && yMove[2] < 9) count++;
            if (yMove[3] > 0 && yMove[3] < 9) count++;
        }
        if ((xMove[3] > 0 && xMove[3] < 9)) {
            if (yMove[2] > 0 && yMove[2] < 9) count++;
            if (yMove[3] > 0 && yMove[3] < 9) count++;
        }
        System.out.println(count);
    }
}
