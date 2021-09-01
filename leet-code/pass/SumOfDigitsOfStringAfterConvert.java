package pass;

import java.util.List;

public class SumOfDigitsOfStringAfterConvert {

    public static int getLucky(String s, int k) {

        String converted = "";

        for (int i = 0; i < s.length(); i++) {
            String str = String.valueOf(s.charAt(i) - 'a' + 1);
            converted += str;
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = 0;
            for (int j = 0; j < converted.length(); j++) {
                sum += converted.charAt(j) - '0';
            }
            converted = sum + "";
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getLucky("abcd", 2));
    }
}
