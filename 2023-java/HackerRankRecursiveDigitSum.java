public class HackerRankRecursiveDigitSum {
    public static int superDigit(String n, int k) {
        long sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += (n.charAt(i) - '0');
        }
        sum *= k;
        n = sum + "";
        while (sum >= 10) {
            sum = 0;
            for (int i = 0; i < n.length(); i++) {
                sum += (n.charAt(i) - '0');
            }
            n = sum + "";
        }
        return (int) sum;
    }

    public static void main(String[] args) {
        System.out.println(superDigit("148", 3));
    }
}
