public class Programmers68935 {

    public static int solution(int n) {
        StringBuilder ternary = new StringBuilder();
        while (n >= 3) {
            ternary.append(n % 3);
            n = n / 3;
        }
        ternary.append(n % 3);
        return Integer.parseInt(ternary.toString(), 3);
    }

    public static void main(String[] args) {
        System.out.println(solution(45));
    }
}
