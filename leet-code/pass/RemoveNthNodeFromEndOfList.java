package pass;

public class RemoveNthNodeFromEndOfList {


    public ListNode2 removeNthFromEnd(ListNode2 head, int n) {

        ListNode2 node = head;
        int count = 1;
        while (node.next != null) {
            node = node.next;
            count++;
        }

        ListNode2 target = head;
        ListNode2 previous = null;
        for (int i = 1; i <= count - n; i++) {
            previous = target;
            target = target.next;
        }
        ListNode2 beNext = target.next == null ? null : target.next;

        if (previous == null) {      // previous 가 null 이면 지우려는 노드가 head인 경우
            return beNext;
        }
        previous.next = beNext;


        return head;
    }
}

class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2() {
    }

    ListNode2(int val) {
        this.val = val;
    }

    ListNode2(int val, ListNode2 next) {
        this.val = val;
        this.next = next;
    }
}
