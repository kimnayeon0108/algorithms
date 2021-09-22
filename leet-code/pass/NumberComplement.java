package pass;

public class NumberComplement {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        String answer = "";
        for (char c : s.toCharArray()) {
            if (c == '1') {
                answer += '0';
            } else {
                answer += '1';
            }
        }

        return Integer.parseInt(answer, 2);
    }

    public static void main(String[] args) {
        NumberComplement n = new NumberComplement();
        n.findComplement(5);
    }
}
