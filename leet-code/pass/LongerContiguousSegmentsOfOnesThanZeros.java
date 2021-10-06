package pass;

public class LongerContiguousSegmentsOfOnesThanZeros {
    public boolean checkZeroOnes(String s) {

        int[] max = new int[2];
        int[] arr = new int[2];
        if(s.charAt(0) == '0') {
            arr[0]++;
            max[0] = arr[0];
        } else {
            arr[1]++;
            max[1] = arr[1];
        }
        for (int i = 1; i < s.length(); i++) {
            // 다른 수가 나오면 0으로 초기화
            if(s.charAt(i) != s.charAt(i-1)) {
                arr[s.charAt(i) - '0'] = 0;
            }

            arr[s.charAt(i) - '0']++;

            max[s.charAt(i) - '0'] = Math.max(max[s.charAt(i) - '0'], arr[s.charAt(i) - '0']);
        }
        return max[1] > max[0];
    }
}
