package pass;

public class ThousandSeparator {
    public String thousandSeparator(int n) {

        String num = n + "";

        String answer = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.length() - 1 - i) % 3 == 0 && i != num.length()-1) {
                answer = num.charAt(i) + "." + answer;
            } else {
                answer = num.charAt(i) + answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ThousandSeparator t = new ThousandSeparator();
        System.out.println(t.thousandSeparator(1234));
    }
}
