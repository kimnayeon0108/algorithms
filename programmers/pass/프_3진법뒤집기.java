package pass;

public class 프_3진법뒤집기 {
    public static int solution(int n) {
        String num = "";
        while (n >= 3) {
            num += n % 3;
            n = n / 3;
        }
        num += n;
        System.out.println(num);

        return Integer.parseInt(num, 3);
    }

    public static void main(String[] args) {
        System.out.println(solution(45));
    }
}
