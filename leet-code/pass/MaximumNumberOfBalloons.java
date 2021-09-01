package pass;

import java.util.ArrayList;
import java.util.List;

public class MaximumNumberOfBalloons {

    public static int maxNumberOfBalloons(String text) {

        int[] count = new int[26];
        List<Character> balloon = new ArrayList<>();
        balloon.add('a');
        balloon.add('b');
        balloon.add('l');
        balloon.add('o');
        balloon.add('n');

        for (int i = 0; i < text.length(); i++) {
            if (balloon.contains(text.charAt(i))) {
                count[text.charAt(i) - 'a']++;
            }
        }
        count['l' - 'a'] /= 2;
        count['o' - 'a'] /= 2;

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < count.length; i++) {
            if (balloon.contains((char) ('a' + i))) {
                min = Math.min(min, count[i]);
            }
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));
    }
}
