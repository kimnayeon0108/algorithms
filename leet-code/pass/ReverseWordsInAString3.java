package pass;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInAString3 {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        return Arrays.stream(arr).collect(Collectors.joining(" "));
    }
}
