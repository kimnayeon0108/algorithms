package pass;

class 문자열다루기기본 {
    public boolean solution(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') {
                return false;
            }
        }
        if(s.length() != 4 && s.length() != 6) return false;

        return true;
    }
}
