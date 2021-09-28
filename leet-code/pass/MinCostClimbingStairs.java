package pass;

public class MinCostClimbingStairs {
    // DP 유형, 최소비용 구하기
    public static int minCostClimbingStairs(int[] cost) {
        int[] arr = new int[1001];
        arr[0] = 0;
        arr[1] = 0;
        for (int i = 2; i <= cost.length; i++) {
            arr[i] = Math.min(arr[i - 1] + cost[i - 1], arr[i - 2] + cost[i - 2]);
        }
        return arr[cost.length];
    }

    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int[] cost2 = {10, 15, 20};
        minCostClimbingStairs(cost2);
    }
}
