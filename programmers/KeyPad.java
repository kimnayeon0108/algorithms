public class KeyPad {

    /**
     * 잘 안풀려서 핵심 규칙을 풀이를 통해 발견하고 통과한 문제
     *
     * 카카오 인턴 키패드 누르기 (https://programmers.co.kr/learn/courses/30/lessons/67256)
     * 풀이를 보니, 아래와 같은 규칙을 찾는게 관건인 듯
     * <p>
     * if(curr_L % 3 == 1) dist_L = abs(tmp - curr_L - 1) / 3 + 1;
     * else dist_L = abs(tmp - curr_L) / 3;
     * <p>
     * if(curr_R % 3 == 0) dist_R= abs(tmp - curr_R + 1) / 3 + 1;
     * else dist_R = abs(tmp - curr_R) / 3;
     */

    public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int leftLocation = 10;
        int rightLocation = 12;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] == 0 ? 11 : numbers[i];

            if (numbers[i] % 3 == 1) {
                answer.append("L");
                leftLocation = numbers[i];
            } else if (numbers[i] % 3 == 0) {
                answer.append("R");
                rightLocation = numbers[i];
            } else {
                int leftDistance = 0;
                int rightDistance = 0;

                if (leftLocation % 3 == 1) {
                    leftDistance = Math.abs(numbers[i] - leftLocation - 1) / 3 + 1;
                } else {
                    leftDistance = Math.abs(numbers[i] - leftLocation) / 3;
                }

                if (rightLocation % 3 == 0) {
                    rightDistance = Math.abs(numbers[i] - rightLocation + 1) / 3 + 1;
                } else {
                    rightDistance = Math.abs(numbers[i] - rightLocation) / 3;
                }

                if (leftDistance == rightDistance) {
                    if (hand.equals("left")) {
                        answer.append("L");
                        leftLocation = numbers[i];
                    } else {
                        answer.append("R");
                        rightLocation = numbers[i];
                    }
                } else if (leftDistance > rightDistance) {
                    answer.append("R");
                    rightLocation = numbers[i];
                } else if (leftDistance < rightDistance) {
                    answer.append("L");
                    leftLocation = numbers[i];
                }

            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String result = solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left");
        String answer = "LRLLRRLLLRR";
        System.out.println(result.equals(answer));
        System.out.println(result);
    }
}
