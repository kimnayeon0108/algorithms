package pass.binary_search;/* The isBadVersion API is defined in the parent class pass.binary_search.VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;
        int pivot = 1;

        while (left <= right) {

            /**
             * pivot = (left + right) / 2 로 하게 되면
             * n = 2126753390
             * bad = 1702766719 의 경우에서 overflow 발생 할 수 있다.
             */
            pivot = left + (right - left) / 2;

            if (isBadVersion(pivot) && !isBadVersion(pivot - 1)) {
                return pivot;
            }

            if (isBadVersion(pivot)) {
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }
        return pivot;
    }

    public static void main(String[] args) {
        FirstBadVersion f = new FirstBadVersion();
        f.firstBadVersion(3);
    }
}

class VersionControl {
    boolean isBadVersion(int version) {
        if (version >= 2) {
            return true;
        }
        return false;
    }
}
