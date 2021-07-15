package pass;

public class ReplaceAllDigitsWithCharacters {
    // 1844번 문제

    // s = 짝수 인덱스는 영문자, 홀수 인덱스는 숫자
    public static String replaceDigits(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            if (i != s.length() - 1) {
                int idx = s.charAt(i + 1) - '0';
                char alpha = (char) (s.charAt(i) + idx);
                str.append(s.charAt(i));
                str.append(alpha);
            }
            if (i == s.length() - 1) {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceDigits("a1b2c3d4e"));
    }
}
