package pass;

public class CalculateMoneyInLeetcodeBank {
    public static int totalMoney(int n) {

        int sum = 0;
        int count = 0;
        int monCount = 0;
        for (int i = 0; i < 7; i++) {
            if (count == n) break;
            sum += i + monCount + 1;
            count++;
            if (i == 6) {
                i = -1;
                monCount++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        totalMoney(10);
    }
}
