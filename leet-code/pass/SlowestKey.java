package pass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SlowestKey {
    public static char slowestKey(int[] releaseTimes, String keysPressed) {

        int max = releaseTimes[0];
        int[] times = new int[releaseTimes.length];
        times[0] = releaseTimes[0];
        for (int i = 1; i < releaseTimes.length; i++) {
            times[i] = releaseTimes[i] - releaseTimes[i - 1];
            max = Math.max(max, times[i]);
        }

        List<Integer> minIdx = new ArrayList<>();
        for (int i = 0; i < times.length; i++) {
            if (times[i] == max) {
                minIdx.add(i);
            }
        }

        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < minIdx.size(); i++) {
            characters.add(keysPressed.charAt(minIdx.get(i)));
        }
        characters.sort(Collections.reverseOrder());
        return characters.get(0);
    }

    public static void main(String[] args) {
        int[] arr = {9,29,49,50};
        String str = "cbcd";
        slowestKey(arr, str);
    }
}
