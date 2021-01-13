package algorithms;

public class LeetCode14 {
    // 통과 못한 코드임 아직 미해결
    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        if (strs.length == 0) return answer;
        if (strs.length == 1) return strs[0];
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs[1].length(); j++) {
                if (strs[0].charAt(i) == strs[1].charAt(j)) {
                    answer += strs[0].charAt(i);
                }
            }
        }
        int idx = 0;
        for (int i = 2; i < strs.length; i++) {
            for (int j = 0; j < answer.length(); j++) {
                if(idx > j) break;
                if (answer.charAt(j) != strs[i].charAt(j)) {
                    idx = j;
                    break;
                }
            }
        }
        return answer.substring(0,idx);
    }

    public static void main(String[] args) {
        LeetCode14 l = new LeetCode14();
        System.out.println(l.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}
