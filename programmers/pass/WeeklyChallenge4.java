package pass;

import java.util.*;

public class WeeklyChallenge4 {

    public static String solution(String[] table, String[] languages, int[] preference) {

        List<List<String>> tableList = new ArrayList<>();
        for (int i = 0; i < table.length; i++) {
            List<String> list = Arrays.asList(table[i].split(" "));
            tableList.add(list);
        }

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < tableList.size(); i++) {
            String job = tableList.get(i).get(0);
            int sum = 0;
            for (int j = 0; j < languages.length; j++) {
                String lan = languages[j];
                int lanScore = tableList.get(i).contains(lan) ? 6 - tableList.get(i).indexOf(lan) : 0;
                sum += preference[j] * lanScore;
            }
            map.put(job, sum);
        }

        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(((o1, o2) -> o2.getValue() - o1.getValue()));
        int max = entryList.get(0).getValue();

        return entryList.stream().filter(e -> e.getValue() == max).sorted((s1, s2) -> s1.getKey().compareTo(s2.getKey())).findFirst().get().getKey();
    }

    public static void main(String[] args) {
        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] languages = {"PYTHON", "C++", "SQL"};
        int[] preference = {7, 5, 5};
        System.out.println(solution(table, languages, preference));
    }
}
