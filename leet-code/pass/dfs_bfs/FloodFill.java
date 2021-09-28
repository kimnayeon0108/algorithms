package pass.dfs_bfs;

class FloodFill {

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, -1, 0, 1};


    // start from image[sr][sc]
    // dfs
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int origin = image[sr][sc];
        if (origin == newColor) return image;

        dfs(image, sr, sc, newColor, origin);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int newColor, int origin) {
        image[sr][sc] = newColor;
        for (int i = 0; i < 4; i++) {
            if (sr + dx[i] >= image.length || sr + dx[i] < 0
                    || sc + dy[i] >= image[0].length || sc + dy[i] < 0) {
                continue;
            }
            if (image[sr + dx[i]][sc + dy[i]] == origin) {
                dfs(image, sr + dx[i], sc + dy[i], newColor, origin);
            }
        }
    }

    public static void main(String[] args) {
        FloodFill f = new FloodFill();
        int[][] image = {{0, 0, 0}, {1, 0, 0}};
        f.floodFill(image, 1, 0, 2);
    }
}
