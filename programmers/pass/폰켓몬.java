package pass;

import java.util.Arrays;

public class 폰켓몬 {

    // 가장 많은 종류의 포켓몬을 선택하고, 그 종류의 수
    // n/2 종류 가질 수 있음
    public int solution(int[] nums) {
        int kind = (int) Arrays.stream(nums).distinct().count();

        return kind < nums.length/2 ? kind : nums.length/2;
    }
}
