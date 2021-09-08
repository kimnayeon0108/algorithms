package pass;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {

        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String sub = words[i];
            for (int j = 0; j < words.length; j++) {
                if(i==j) continue;

                String word = words[j];
                if(word.contains(sub)) {
                    result.add(sub);
                    break;
                }
            }
        }
        return result;
    }
}
