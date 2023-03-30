import java.util.ArrayList;
import java.util.List;

public class HackerRankNewYearChaos {
    // 푸는 법 검색해서 패스
    public static void minimumBribes(List<Integer> q) {
        int bribes = 0;

        for (int i = 0; i < q.size(); i++) {
            if (q.get(i) - i - 1 > 2) {
                System.out.println("Too chaotic");
                return;
            }
        }
        for (int i = 0; i < q.size(); i++) {
            // 큰 수가 자기 자리보다 앞에 있는 경우
            if (q.get(i) > i + 1) {
                for (int j = i + 1; j < q.size(); j++) {
                    // 원래 자기 자리로 돌려놓기
                    int tmp = q.get(i);
                    q.set(i, q.get(j));
                    q.set(j, tmp);
                    bribes++;

                    if (q.get(i) == i + 1) break;
                }
            }
        }
        System.out.println(bribes);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(4);

        minimumBribes(list);
    }
}
