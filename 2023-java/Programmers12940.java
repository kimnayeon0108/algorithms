public class Programmers12940 {
    // 최소공배수 = 두 수의 곱 / 최대 공약수
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int bigger = n >= m ? n : m;
        int smaller = n < m ? n : m;

        int rest = bigger % smaller;
        while (rest > 0) {
            bigger = smaller;
            smaller = rest;
            rest = bigger % smaller;
        }
        answer[0] = smaller;
        answer[1] = n * m / smaller;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(24, 18)[0]);
        System.out.println(solution(24, 18)[1]);
    }
}
