import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HackerRankGridChallenge {
    public static String gridChallenge(List<String> grid) {
        List<char[]> list = grid.stream().map(str -> {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            return chars;
        }).collect(Collectors.toList());

        for (int i = 0; i < grid.get(0).length(); i++) {
            for (int j = 1; j < grid.size(); j++) {
                if (list.get(j)[i] < list.get(j-1)[i]) return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        List<String> grid = new ArrayList<>();
        grid.add("abc");
        grid.add("lmp");
        grid.add("qrt");
        gridChallenge(grid);
    }
}
