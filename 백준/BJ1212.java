import java.util.*;

/**
 * 풀이 보고 품..
 */
public class BJ1212 {
    static int[][] check;        // 간선 연결 상태
    static boolean[] visited;
    static int n;
    static int m;
    static int v;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();

        check = new int[1001][1001];
        visited = new boolean[1001];

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            check[x][y] = 1;
            check[y][x] = 1;
        }

        dfs(v);
        System.out.println();

        visited = new boolean[1001];

        bfs(v);
    }

    static void dfs(int start) {
        visited[start] = true;
        System.out.print(start + " ");

        for (int i = 1; i <= n; i++) {
            if (check[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        System.out.print(start + " ");

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i = 1; i <= n; i++) {
                if (check[temp][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
