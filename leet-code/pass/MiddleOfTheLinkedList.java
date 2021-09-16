package pass;

class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {

        int count = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            count++;
        }

        ListNode n = head;

        for (int i = 0; i < count / 2; i++) {
            n = n.next;
        }
        return n;

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
