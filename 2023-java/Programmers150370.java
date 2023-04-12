import java.util.*;

public class Programmers150370 {
    public static int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termsMap = new HashMap<>();
        Arrays.stream(terms).forEach(term -> {
            String[] split = term.split(" ");
            termsMap.put(split[0], Integer.parseInt(split[1]));
        });

        int year = Integer.parseInt(today.substring(0, 4));
        int month = Integer.parseInt(today.substring(5, 7));
        int day = Integer.parseInt(today.substring(8, 10));

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
            String privacy = privacies[i];
            String[] split = privacy.split(" ");
            String date = split[0];
            String term = split[1];

            int privacyDay = Integer.parseInt(date.substring(8, 10));
            int tempMonth = Integer.parseInt(date.substring(5, 7)) + termsMap.get(term);
            int tempYear = Integer.parseInt(date.substring(0, 4));
            int privacyMonth = tempMonth % 12;
            if (privacyMonth == 0) privacyMonth = 12;
            int privacyYear = tempYear;
            if (tempMonth > 12) {
                if (tempMonth % 12 == 0) {
                    privacyYear += (tempMonth / 12 - 1);
                } else {
                    privacyYear += tempMonth / 12;
                }
            }

            if (privacyYear < year) {
                list.add(i + 1);
            } else if (privacyYear == year) {
                if (privacyMonth < month) {
                    list.add(i + 1);
                } else if (privacyMonth == month) {
                    if (privacyDay <= day) {
                        list.add(i + 1);
                    }
                }

            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        String today = "2021.12.08";
        String[] terms = {"A 18"};
        String[] privacies = {"2020.06.08 A"};

        solution(today, terms, privacies);

    }
}
