package pass;

public class DistributeCandiesToPeople {

    public static int[] distributeCandies(int candies, int num_people) {

        int[] answer = new int[num_people];

        int give = 0;
        while (candies > 0) {
            for (int i = 0; i < num_people; i++) {
                if (candies == 0) break;

                give++;

                if (candies - give < 0) {
                    give = candies;
                }
                answer[i] += give;
                candies -= give;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = distributeCandies(10, 3);
    }
}
