package pass;

import java.util.Scanner;

public class EscapeFromRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int[] distances = new int[4];
        distances[0] = w - x;
        distances[1] = h - y;
        distances[2] = x;
        distances[3] = y;

        int result = Integer.MAX_VALUE;
        for (int distance : distances) {
            result = Math.min(result, distance);
        }

        System.out.println(result);
    }
}
