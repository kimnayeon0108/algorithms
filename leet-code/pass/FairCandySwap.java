package pass;

import java.util.Arrays;

public class FairCandySwap {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aSum = Arrays.stream(aliceSizes).sum();
        int bSum = Arrays.stream(bobSizes).sum();

        int ave = (aSum + bSum) / 2;

        int[] answer = new int[2];
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if (aSum - aliceSizes[i] + bobSizes[j] == ave) {
                    answer[0] = aliceSizes[i];
                    answer[1] = bobSizes[j];
                    return answer;

                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {2};
        int[] b = {1, 3};
        fairCandySwap(a, b);
    }
}
