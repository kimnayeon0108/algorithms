import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

    /**
     * Map 자료구조를 이용해서 글자를 key, 글자의 개수를 value로 해서 비교하도록 시도했는데
     * 너무 복잡한거 같아서 풀이를 보고 푼 문제..
     */

    // 글자마다 알파벳 글자를 배열에 추가해서, min 으로
    public static List<String> commonChars(String[] words) {
        int[] firstWord = new int[26];
        int[] compared;

        for (char a : words[0].toCharArray()) {
            firstWord[a - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            compared = new int[26];
            for (char a : words[i].toCharArray()) {
                compared[a - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                firstWord[j] = Math.min(firstWord[j], compared[j]);
            }
        }

        List<String> answer = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < firstWord[i]; j++) {
                char alpha = (char) ('a' + i);
                answer.add(String.valueOf(alpha));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        List<String> str = commonChars(new String[]{"bella", "label", "roller"});
        str.forEach(System.out::println);
    }
}
