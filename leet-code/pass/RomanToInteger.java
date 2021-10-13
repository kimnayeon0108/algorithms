package pass;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

        int answer = 0;
        int i = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (i >= 0) {
            if (i != 0 && map.containsKey(sb.substring(i - 1))) {
                answer += map.get(sb.substring(i-1));
                sb.delete(i-1,i+1);
                i = i-2;
            } else {
                answer += map.get(sb.substring(i));
                sb.deleteCharAt(i);
                i--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        romanToInt("MCMXCIV");
    }
}
