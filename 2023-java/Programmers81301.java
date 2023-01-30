import java.util.HashMap;
import java.util.Map;

public class Programmers81301 {
    public static int solution(String s) {
        StringBuilder answer = new StringBuilder();
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (getNumber(number.toString()) >= 0 && getNumber(number.toString()) <= 9) {
                answer.append(getNumber(number.toString()));
                number = new StringBuilder();
            }

            if (s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9) {
                answer.append(s.charAt(i));
            } else {
                number.append(s.charAt(i));
            }
        }
        if (getNumber(number.toString()) >= 0 && getNumber(number.toString()) <= 9) {
            answer.append(getNumber(number.toString()));
        }
        return Integer.parseInt(answer.toString());
    }

    private static int getNumber(String number) {
        Map<String, Integer> words = new HashMap<>();
        words.put("zero", 0);
        words.put("one", 1);
        words.put("two", 2);
        words.put("three", 3);
        words.put("four", 4);
        words.put("five", 5);
        words.put("six", 6);
        words.put("seven", 7);
        words.put("eight", 8);
        words.put("nine", 9);

        return words.getOrDefault(number, 11);
    }

    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
    }
}
