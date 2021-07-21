package pass;

public class XOROperationInAnArray {

    public static int xorOperation(int n, int start) {

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = start + 2 * i;
            System.out.print(arr[i]);
        }
        System.out.println();
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result ^= arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(xorOperation(5, 0));
    }
}
