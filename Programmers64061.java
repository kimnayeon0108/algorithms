package algorithms;

import java.util.ArrayList;

public class Programmers64061 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> box = new ArrayList<>(moves.length);

        // box 생성
        for (int i = 0; i < moves.length; i++) {
            int column = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                if (board[j][column] != 0) {
                    box.add(board[j][column]);
                    board[j][column] = 0;
                    break;
                }
            }

        }
        // 바구니 안에서 인형 터지는 동작
        for (int i = 0; i < box.size() - 1; i++) {
            if (box.get(i) == box.get(i + 1)) {
                box.remove(i + 1);
                box.remove(i);
                answer += 2;
                i = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers64061 p = new Programmers64061();
        int[][] board = {{0, 2, 0}, {1, 2, 0}, {2, 2, 1}};
        int[] moves = {1, 2, 2, 2, 1, 3};

        System.out.println(p.solution(board, moves));
    }
}
