package pass;

public class ReverseString {

    public void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0; i < len / 2; i++) {
            char temp = s[len - i - 1];
            s[len - i - 1] = s[i];
            s[i] = temp;
        }
    }
}