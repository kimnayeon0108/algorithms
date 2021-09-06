package pass;

import java.util.*;

public class 크레인인형뽑기게임 {
    public static int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();

        List<List<Integer>> boardList = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != 0) {
                    list.add(board[j][i]);
                }
            }
            boardList.add(list);
        }
        int answer = 0;
        for (int i = 0; i < moves.length; i++) {
            if (!boardList.get(moves[i] - 1).isEmpty()) {
                int num = boardList.get(moves[i] - 1).remove(0);
                if (!stack.isEmpty() && stack.peek() == num) {
                    stack.pop();
                    answer += 2;
                } else {
                    stack.add(num);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] move = {1, 5, 3, 5, 1, 2, 1, 4};

        int[][] board2 = {{0, 2, 0}, {1, 2, 0}, {2, 2, 1}};
        int[] move2 = {1, 2, 2, 2, 1, 3};
        solution(board, move);
    }
}
