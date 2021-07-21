package pass;

import java.util.*;
import java.util.stream.Collectors;

public class TheKWeakestRowsInAMatrix {

    public static int[] kWeakestRows(int[][] mat, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {

            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            System.out.println(sum);
            map.put(i, sum);
        }
        List<Integer> listKeySet = new ArrayList<>(map.keySet());
        Collections.sort(listKeySet, (v1, v2) -> (map.get(v1).compareTo(map.get(v2))));

        List<Integer> list =  listKeySet.stream()
                .limit(k)
                .collect(Collectors.toList());

        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] answer = kWeakestRows(new int[][]{
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}}, 2);
        System.out.println();
        Arrays.stream(answer).forEach(System.out::println);
    }
}
