package pass;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SlowestKey2 {
    // slowest key 다른 풀이
    public static char slowestKey(int[] releaseTimes, String keysPressed) {

        Map<Character, Integer> times = new HashMap<>();
        times.put(keysPressed.charAt(0), releaseTimes[0]);
        for (int i = 1; i < releaseTimes.length; i++) {
            int value = times.getOrDefault(keysPressed.charAt(i), 0);
            times.put(keysPressed.charAt(i), Math.max(releaseTimes[i] - releaseTimes[i - 1], value));
        }

        int max = times.values().stream().mapToInt(Integer::intValue).max().getAsInt();

        return times.keySet().stream().filter(a -> times.get(a) == max).sorted(Comparator.reverseOrder()).findFirst().get();
    }

    public static void main(String[] args) {
        int[] arr = {12, 23, 36, 46, 62};
        System.out.println(slowestKey(arr, "spuda"));
    }
}
