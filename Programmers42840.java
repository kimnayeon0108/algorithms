package algorithms;

public class Programmers42840 {
    public int[] solution(int[] answers) {
        int[] answer = {};
//        int[] sGroup = {getS1(answer.length), getS2(answers.length), getS3(answers.length)};

        int[] s1 = getS1(answers.length);
        int[] s2 = getS2(answers.length);
        int[] s3 = getS3(answers.length);

        for(int i = 0; i < 3; i++){

        }

        return answer;
    }

    public int[] getS1(int length) {
        // s1
        int[] s1 = new int[length];
        for (int i = 0; i < length; i++) {
            s1[i] = (i % 5) + 1;
        }
        return s1;
    }

    public int[] getS2(int length) {
        // s2
        int[] s2 = new int[length];
        for (int i = 0; i < length; i += 2) {
            s2[i] = 2;
        }
        int[] nums = {1, 3, 4, 5};
        int j = 0;
        for (int i = 1; i < length; i += 2) {
            if (j > 3) s2[i] = nums[j % 4];
            else s2[i] = nums[j];
            j++;
        }
        return s2;
    }

    public int[] getS3(int length) {
        // s3
        int[] s3 = new int[length];
        int[] nums2 = {3, 1, 2, 4, 5};
        int k = 0;
        for (int i = 0; i < length - 1; i += 2) {
            if (k > 4) {
                s3[i] = nums2[k % 5];
                s3[i + 1] = nums2[k % 5];
            } else {
                s3[i] = nums2[k];
                s3[i + 1] = nums2[k];
            }
            k++;
        }
        if (s3[length - 1] == 0) s3[length - 1] = nums2[k];
        return s3;
    }

    public boolean compareToAnswer(int[] answers, int[] s) {
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] != s[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Programmers42840 p = new Programmers42840();


    }
}
