package pass;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public static List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> answer = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (i < 10) {
                answer.add(i);
                continue;
            }

            if (i % 10 == 0) continue;

            String num = i + "";
            boolean isDividing = true;
            for (int j = 0; j < num.length(); j++) {
                if(num.charAt(j) == '0') {
                    isDividing = false;
                    break;
                }
                if (i % (num.charAt(j) - '0') != 0) {
                    isDividing = false;
                    break;
                }
            }
            if (isDividing) {
                answer.add(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        List<Integer> answer = selfDividingNumbers(1, 22);
        answer.forEach(System.out::println);
    }
}
