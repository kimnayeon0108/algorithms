package algorithms;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.val == current.next.val){
                ListNode tmp = current.next;
                current.next = tmp.next;
            } else current = current.next;
        }
        return head;
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

class LeetCode83 {
    public static void main(String[] args) {
        ListNode node3 = new ListNode(1);
        ListNode node2 = new ListNode(1,node3);
        ListNode head = new ListNode(1,node2);

        Solution s = new Solution();
        s.deleteDuplicates(head);
    }
}