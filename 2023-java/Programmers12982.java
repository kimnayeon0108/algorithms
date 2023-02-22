import java.util.Arrays;

public class Programmers12982 {
    public int solution(int[] d, int budget) {

        Arrays.sort(d);
        int count = 0;
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            count++;

            if (budget == 0) {
                return count;
            }

            if (budget < 0) {
                return count - 1;
            }
        }
        return count;
    }
}
