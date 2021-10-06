package pass;

public class ElementAppearingMoreThan25InSortedArray {
    public static int findSpecialInteger(int[] arr) {
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (i != 0 && arr[i] != arr[i - 1]) {
                count = 0;
            }
            count++;
            if ((double)count / len * 100 > 25) {
                return arr[i];
            }
        }
        return arr[len - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        System.out.println(findSpecialInteger(arr));
    }
}
