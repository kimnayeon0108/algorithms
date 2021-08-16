package pass;

public class WeeklyChallenge1 {

    public long solution(int price, int money, int count) {

        long total = 0;
        for (long i = 0; i <= count; i++) {
             total += price * i;
        }
        return total - money > 0 ? total - money : 0;
    }
}
