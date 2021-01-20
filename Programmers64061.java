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
        for (int i = 0; i < box.size(); i++) {
            if(box.get(i) == 0) box.remove(i);
            for (int j = 0; j < box.size() - 1; j++) {
                if (box.get(j) == box.get(j + 1)) {
                    box.remove(j + 1);
                    box.remove(j);
                    answer += 2;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers64061 p = new Programmers64061();
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1},
            {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2,5,1,4,3};

        System.out.println(p.solution(board, moves));
    }
}
