package pass;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        // 0번째와 본인 행과 일치하는 열은 전부 1
        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    list.add(1);
                } else {
                    list.add(answer.get(i-1).get(j-1) + answer.get(i-1).get(j));
                }
            }
            answer.add(list);
        }
        return answer;
    }
}
