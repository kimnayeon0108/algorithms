package pass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NextGreaterElement1 {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        int[] answer = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int idx = list2.indexOf(nums1[i]);

            if (idx < nums2.length - 1) {
                for (int j = idx + 1; j < nums2.length; j++) {
                    if (list2.get(idx) < list2.get(j)) {
                        answer[i] = list2.get(j);
                        break;
                    }
                }
                if (answer[i] == 0) answer[i] = -1;
            } else {
                answer[i] = -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 2, 4};
        int[] b = {6, 5, 4, 3, 2, 1, 7};

        int[] a1 = {4, 1, 2};
        int[] b1 = {1, 3, 4, 2};
        int[] answer = nextGreaterElement(a1, b1);
        Arrays.stream(answer).forEach(System.out::println);
    }
}
