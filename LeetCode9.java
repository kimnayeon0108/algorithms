package algorithms;

public class LeetCode9 {
    public boolean isPalindrome(int x) {
        String str = "" + x;
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        if (str.equals(reversedStr)) return true;
        else return false;
    }
}
