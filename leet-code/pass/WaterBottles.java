package pass;

public class WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int empty = numBottles;
        int sum = numBottles;

        while (empty >= numExchange) {
            sum += empty / numExchange;
            empty = empty / numExchange + empty % numExchange;
        }
        return sum;
    }

    public static void main(String[] args) {
        numWaterBottles(9, 3);
    }
}
