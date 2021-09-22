package pass;

public class CountSquareSumTriples {
    public int countTriples(int n) {
        int answer = 0;
        for (int i = 1; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                for (int k = j + 1; k <= n; k++) {
                    if (k == Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2))) {
                        answer++;
                    }
                }
            }
        }
        return answer * 2;
    }
}
