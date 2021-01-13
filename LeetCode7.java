package algorithms;

public class LeetCode7 {
    public int reverse(int x) {
        int result = 0;
        String str = String.valueOf(Math.abs(x));
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        try {
            return result = x > 0 ? Integer.valueOf(reversedStr) : Integer.valueOf(reversedStr) * -1;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
