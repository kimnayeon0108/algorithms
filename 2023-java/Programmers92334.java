import java.util.*;

public class Programmers92334 {
    public static int[] solution(String[] id_list, String[] report, int k) {
        List<String> reports = new ArrayList<>();
        Set<String> uniqueValues = new HashSet<>();
        for (String s1 : report) {
            if (uniqueValues.add(s1)) {
                reports.add(s1);
            }
        }

        // 신고 당한 map
        Map<String, Integer> reportedMap = new HashMap<>();

        for (String s : reports) {
            String[] split = s.split(" ");
            if (reportedMap.containsKey(split[1])) {
                reportedMap.put(split[1], reportedMap.get(split[1]) + 1);
            } else {
                reportedMap.put(split[1], 1);
            }
        }

        Map<String, Integer> reporterMap = new HashMap<>();
        for (String s : reports) {
            if (reportedMap.getOrDefault(s.split(" ")[1], 0) >= k) {
                reporterMap.put(s.split(" ")[0], reporterMap.getOrDefault(s.split(" ")[0], 0) + 1);
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = reporterMap.getOrDefault(id_list[i], 0);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] idList = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int[] arr = solution(idList, report, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
