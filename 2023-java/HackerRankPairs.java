import java.util.Comparator;
import java.util.List;

public class HackerRankPairs {

    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        arr.sort(Comparator.reverseOrder());
        int count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) - arr.get(j) == k) {
                    count++;
                    if (j == arr.size() - 1) return count;
                    break;
                }
            }
        }
        return count;
    }
}
