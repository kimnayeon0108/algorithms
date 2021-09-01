package pass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LastStoneWeight {

    // reverse로 정렬하고 앞에서부터 두개 씩 처리
    public static int lastStoneWeight(int[] stones) {

        List<Integer> stoneList = Arrays.stream(stones).boxed().collect(Collectors.toList());

        while (stoneList.size() > 1) {
            stoneList.sort(Comparator.reverseOrder());
            int a = stoneList.get(0);
            int b = stoneList.get(1);

            stoneList.remove(0);
            stoneList.remove(0);

            if (a != b) {
                int diff = Math.abs(a - b);
                stoneList.add(diff);
            }
        }

        return stoneList.size() == 0 ? 0 : stoneList.get(0);
    }

    public static void main(String[] args) {
        int[] list = {9, 10, 1, 7, 3};
        System.out.println(lastStoneWeight(list));
    }

}
