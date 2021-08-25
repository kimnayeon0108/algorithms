package pass;

public class IslandPerimeter {

    public static int islandPerimeter(int[][] grid) {

        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {

                    // 범위 벗어나는 경우
                    if (i - 1 < 0) {
                        sum++;
                    }
                    if (i + 1 > grid.length - 1) {
                        sum++;
                    }
                    if (j - 1 < 0) {
                        sum++;
                    }
                    if (j + 1 > grid[i].length - 1) {
                        sum++;
                    }

                    if (i - 1 >= 0 && grid[i - 1][j] == 0) {
                        sum++;
                    }
                    if (i + 1 <= grid.length - 1 && grid[i + 1][j] == 0) {
                        sum++;
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == 0) {
                        sum++;
                    }

                    if (j + 1 <= grid[i].length - 1 && grid[i][j + 1] == 0) {
                        sum++;
                    }
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] a = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        int[][] b = {{1, 0}};
        System.out.println(islandPerimeter(b));
    }
}
