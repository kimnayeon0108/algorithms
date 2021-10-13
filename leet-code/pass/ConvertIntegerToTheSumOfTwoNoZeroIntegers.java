package pass;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public static int[] getNoZeroIntegers(int n) {
        int num = 1;
        int other = 0;
        while (true) {
            other = n - num;
            if (Integer.toString(other).contains("0") || Integer.toString(num).contains("0")) num++;
            else return new int[]{num, other};
        }
    }

    public static void main(String[] args) {
        getNoZeroIntegers(4102);
    }
}
