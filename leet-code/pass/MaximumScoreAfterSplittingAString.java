package pass;

public class MaximumScoreAfterSplittingAString {
    public static int maxScore(String s) {
        // 0 count <-> 1 count
        // maximum
        int zeroC = s.charAt(0) == '0' ? 1 : 0;
        int oneC = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '1') oneC++;
        }
        int sum = zeroC + oneC;

        // i번째를 왼쪽으로 보낸다
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1') oneC--;
            else zeroC++;

            sum = Math.max(sum, oneC + zeroC);
        }

        return sum;
    }

    public static void main(String[] args) {
        maxScore("00");
    }
}
