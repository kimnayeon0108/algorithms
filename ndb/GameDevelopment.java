package ndb;

import java.util.Scanner;

public class GameDevelopment {
    /*
    이코테 구현파트 118p
    내풀이 (미완성)
     */
    public static int n, m, x, y, direction;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        x = sc.nextInt() - 1;
        y = sc.nextInt() - 1;
        direction = sc.nextInt();

        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        // 현재 좌표 방문처리
        map[x][y] = 1;

        // 북동남서
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};


        int count = 0;
        int turnTime = 0;
        while (true) {
            turnDirection();
            int nextX = x + dx[direction];
            int nextY = y + dy[direction];
            if(map[nextX][nextY] == 0) {
                x = nextX;
                y = nextY;
                map[x][y] = 1;
                count++;
            }

        }
//        System.out.println(count);
    }

    public static void turnDirection() {
        direction -= 1;
        if (direction == -1) direction = 3;
    }
}
