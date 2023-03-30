import java.util.ArrayList;
import java.util.List;

public class HackerRankTruckTour {

    public static int truckTour(List<List<Integer>> petrolpumps) {
        int start = 0;
        while (start < petrolpumps.size()) {
            int petrolSum = 0;
            for (int i = start; i < petrolpumps.size() + start; i++) {
                int j = i;
                if (j >= petrolpumps.size()) j = i - petrolpumps.size();
                int petrol = petrolpumps.get(j).get(0);
                petrolSum += petrol;
                if (petrolSum < petrolpumps.get(j).get(1)) {
                    start++;
                    break;
                }

                petrolSum -= petrolpumps.get(j).get(1);

                if (i == petrolpumps.size() + start - 1) {
                    return start;
                }
            }
        }
        return start;
    }

    public static void main(String[] args) {
        List<List<Integer>> petrolpumps = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(3);

        List<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(4);

        petrolpumps.add(list1);
        petrolpumps.add(list2);
        petrolpumps.add(list3);

        truckTour(petrolpumps);
    }
}
