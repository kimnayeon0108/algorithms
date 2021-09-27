package pass;

import java.util.Arrays;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        // 가로 최대 길이와 세로 최대 길이 구하기
        int width = 0;
        int vertical = 0;
        for (int[] size : sizes) {
            Arrays.sort(size);
            width = Math.max(width, size[0]);
            vertical = Math.max(vertical, size[1]);
        }

        return width * vertical;
    }
}
