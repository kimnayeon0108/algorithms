package pass;

import java.util.Arrays;

public class Kth_Number {

    /**
     * 처음에 stream의 skip과 limit를 사용했는데 2,6번이 통과하질 않아서 Arrays.copyOfRange를 이용해서 풀었다.
     */
    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] copied = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(copied);
            answer[i] = copied[commands[i][2] - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };
        int[] result = solution(arr, commands);
        Arrays.stream(result).forEach(System.out::println);
    }
}
