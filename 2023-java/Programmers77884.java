public class Programmers77884 {
    public static int solution(int left, int right) {
        int result = 0;
        int count;
        for (int i = left; i <= right; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                result += i;
            } else {
                result -= i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        solution(13, 17);
    }
}
