public class Programmers12939 {

    public static String solution(String s) {
        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].startsWith("-")) {
                num = Integer.parseInt(arr[i]);
            } else {
                num = Integer.parseInt(arr[i]);
            }
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return min + " " + max;
    }

    public static void main(String[] args) {
        System.out.println(solution("-1 -2 -3 -4"));
        System.out.println(Integer.parseInt("-1"));
    }
}
