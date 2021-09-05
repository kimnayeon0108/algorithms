package pass;

import java.util.ArrayList;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();

        for (int i : arr) {
            if(i % divisor == 0) {
                result.add(i);
            }
        }
        if (result.size() == 0){
            result.add(-1);
        }
        return result.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
