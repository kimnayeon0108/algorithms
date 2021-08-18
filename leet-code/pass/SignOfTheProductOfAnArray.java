package pass;

public class SignOfTheProductOfAnArray {

    public int arraySign(int[] nums) {
        int num = 1;
        for (int i : nums) {
            if (i == 0) return 0;
            if (i < 0) {
                num = num * -1;
            }
        }

        if (num > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
    }
}
