package pass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Budget {

    public static int solution(int[] d, int budget) {

        // 작은 수가 많이 들어가야 더 많은 팀의 물품 구매 가능
        Arrays.sort(d);

        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            if (sum + d[i] <= budget) {
                list.add(d[i]);
                sum += d[i];
            }
        }

        return list.size();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 2, 5, 4}, 9));
    }
}
