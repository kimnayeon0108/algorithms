package pass;

public class NumberStringAndVocab {

    public static int solution2(String s) {
        String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] alphas = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(alphas[i], nums[i]);
        }

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        System.out.println(solution2("one4seveneight"));
    }
}
