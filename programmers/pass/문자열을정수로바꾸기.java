package pass;

public class 문자열을정수로바꾸기 {
    public int solution(String s) {

        if (s.charAt(0) == '-') {
            return Integer.parseInt(s.substring(1)) * -1;
        } else if (s.charAt(0) == '+') {
            return Integer.parseInt(s.substring(1));
        } else {
            return Integer.parseInt(s);
        }
    }
}
