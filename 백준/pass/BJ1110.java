package pass;

import java.util.Scanner;

// 더하기 사이클
public class BJ1110 {
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        run(n, n);
        System.out.println(count);
    }

    static void run(int n, int initial) {
        if (count > 0 && n == initial) return;
        count++;
        int sum;
        int newNum;
        if (n < 10) {
            sum = n;
            newNum = n * 10 + n;
        } else {
            sum = n / 10 + n % 10;

            if (sum % 10 == 0) {
                newNum = n % 10 * 10;
            } else {
                newNum = n % 10 * 10 + sum % 10;
            }
        }

        run(newNum, initial);
    }
}
