package pass;

public class MinimumTimeVisitingAllPoints {
    // 1266번

    // 배열의 순서대로 point를 다 거쳐야 함, 최소 시간으로
    // 최단 거리 구하기..?
    public static int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int[] start = points[i];
            int[] end = points[i + 1];

            count += Math.max(Math.abs(start[0] - end[0]), Math.abs(start[1] - end[1]));
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(minTimeToVisitAllPoints(new int[][]{{1, 1}, {3, 4}, {-1, 0}}));
    }
}
