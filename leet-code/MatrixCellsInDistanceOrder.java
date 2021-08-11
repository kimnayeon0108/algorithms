import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixCellsInDistanceOrder {

    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {

        Cell center = new Cell(rCenter, cCenter, 0);

        /**
         * 0 <= rCenter < rows
         * 0 <= cCenter < cols
         * 위에 조건에 따라 Cell 객체들 생성하고, distance 가 작은 순으로 반환하기
         */
        List<Cell> cellList = new ArrayList<>();
        int distance = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                distance = Math.abs(rCenter - i) + Math.abs(cCenter - j);
                cellList.add(new Cell(i, j, distance));
            }
        }

        cellList = cellList.stream()
                .sorted(Comparator.comparing(Cell::getDistance))
                .collect(Collectors.toList());

        int[][] answer = new int[rows * cols][2];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = new int[]{cellList.get(i).getRow(), cellList.get(i).getCol()};
        }
        return answer;
    }

    public static void main(String[] args) {
        MatrixCellsInDistanceOrder m = new MatrixCellsInDistanceOrder();
        int[][] arr = m.allCellsDistOrder(2, 2, 0, 1);
        Arrays.stream(arr).forEach(x -> System.out.println("row: " + x[0] + ", col: " + x[1]));
    }


    class Cell {
        int row;
        int col;
        int distance;

        public Cell(int row, int col, int distance) {
            this.row = row;
            this.col = col;
            this.distance = distance;
        }

        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }

        public int getDistance() {
            return distance;
        }
    }
}
