package pass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {

    public static int[] solution(int[] answers) {
        int[] student1 = new int[10000];
        int[] student2 = new int[10000];
        int[] student3 = new int[10000];

        int[] forStudent2 = {1, 3, 4, 5};
        int[] forStudent3 = {3, 1, 2, 4, 5};
        int idxFor2 = 0;
        int idxFor3 = 0;

        for (int i = 0; i < 10000; i++) {
            // student1
            student1[i] = (i + 1) % 5;
            if (student1[i] == 0) student1[i] = 5;

            // student2
            if (i % 2 == 0) {
                student2[i] = 2;
            } else {
                student2[i] = forStudent2[idxFor2];
                idxFor2++;
                if (idxFor2 == 4) {
                    idxFor2 = 0;
                }
            }

            // student3
            if (i % 2 == 0) {
                student3[i] = forStudent3[idxFor3];
                idxFor3++;
                if (idxFor3 == 5) {
                    idxFor3 = 0;
                }
            } else {
                student3[i] = student3[i - 1];
            }
        }

        int[] arr = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i]) {
                arr[0]++;
            }
            if (answers[i] == student2[i]) {
                arr[1]++;
            }
            if (answers[i] == student3[i]) {
                arr[2]++;
            }
        }

        List<Integer> answer = new ArrayList<>();
        int max = Math.max(arr[0], Math.max(arr[1], arr[2]));
        if (max == arr[0]) {
            answer.add(1);
        }
        if (max == arr[1]) {
            answer.add(2);
        }
        if (max == arr[2]) {
            answer.add(3);
        }
        return answer.stream().mapToInt(a -> a).toArray();
    }

    public static void main(String[] args) {
        int[] answer = solution(new int[]{1, 2, 3, 4, 5});
        Arrays.stream(answer).forEach(System.out::println);
    }
}
