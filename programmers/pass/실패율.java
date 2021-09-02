package pass;

import java.util.*;

public class 실패율 {

    // 스테이지 도달 but 아직 클리어 못한 수 / 스테이지 도달 수
    // N 전체 스테이지 수
    // stages 사용자가 멈춰있는 스테이지의 배열
    // 실패율이 높은 스테이지부터 내림차순 으로 배열 생성

    // N=5 스테이지는 5까지
    // {2,1,2,6,2,4,3,3}
    // 1번 스테이지 까지 도달 못한 사람은 1명 1/8
    // 2번 3명 3/7
    // 3번 2명 2/4
    // 4번 1명 1/2
    // 5번 0명 0/1
    public static int[] solution(int N, int[] stages) {

        // key: stage
        // map: pass.실패율
        Map<Integer, Double> failMap = new HashMap<>();

        // key: stage
        // map: 스테이지 별 도달 못한 사람
        Map<Integer, Integer> peopleMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i + 1) {
                    if (peopleMap.isEmpty() || !peopleMap.containsKey(i + 1)) {
                        peopleMap.put(i + 1, 1);
                    } else {
                        int value = peopleMap.get(i + 1) + 1;
                        peopleMap.replace(i + 1, value);
                    }
                }
            }
        }

        double people = stages.length;
        for (int i = 0; i < N; i++) {
            if(!peopleMap.containsKey(i+1)) {
                failMap.put(i+1, 0.0);
                continue;
            }
            double fail = peopleMap.get(i + 1) / people;
            failMap.put(i+1, fail);
            people -= peopleMap.get(i + 1);
        }

        List<Integer> keySetList = new ArrayList<>(failMap.keySet());
        Collections.sort(keySetList, (a, b) -> failMap.get(b).compareTo(failMap.get(a)));
        return keySetList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] stages = {2,1,2,6,2,4,3,3};
        int[] answer = solution(5,stages);
    }
}
