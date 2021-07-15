package pass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TruncateSentence {
    // 1816

    public static String truncateSentence(String s, int k) {
        String[] strArr = s.split(" ");
        Arrays.stream(strArr).forEach(System.out::println);

        List<String> strList = Arrays.stream(strArr).limit(k).collect(Collectors.toList());

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < strList.size(); i++) {
            if (i == strList.size() - 1) {
                answer.append(strList.get(i));
            } else {
                answer.append(strList.get(i)).append(" ");
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
    }
}
