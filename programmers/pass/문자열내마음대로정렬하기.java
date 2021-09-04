package pass;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {

        return Arrays.stream(strings).sorted()
                .sorted((s1, s2) -> s1.charAt(n) - s2.charAt(n))
                .collect(Collectors.toList()).toArray(new String[0]);
    }
}
