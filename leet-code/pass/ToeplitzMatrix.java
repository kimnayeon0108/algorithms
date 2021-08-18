package pass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToeplitzMatrix {

    public boolean isToeplitzMatrix(int[][] matrix) {

        /**
         *  row 와 column이 1씩 차이나는 애들끼리 비교
         *  row나 column이 0인게 start
          */

        Map<List<Integer>, Integer> startMap = new HashMap<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || j == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    startMap.put(list, matrix[i][j]);
                }
            }
        }

        for (List<Integer> list : startMap.keySet()) {
            int x = list.get(0);
            int y = list.get(1);
            int value = startMap.get(list);

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == x + 1 && j == y + 1) {
                        if (matrix[i][j] != value) {
                            return false;
                        } else {
                            x++;
                            y++;
                        }
                    }
                }
            }
        }
        return true;
    }
}
