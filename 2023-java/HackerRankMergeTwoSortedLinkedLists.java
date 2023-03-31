public class HackerRankMergeTwoSortedLinkedLists {

    static class SinglyLinkedListNode {

        public SinglyLinkedListNode(int data, SinglyLinkedListNode next) {
            this.data = data;
            this.next = next;
        }

        int data;
        SinglyLinkedListNode next;
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode mergedList;
        SinglyLinkedListNode firstNode;

        // 새로운 저장공간 mergedListd에다가 노드를 하나씩 이어 붙이기
        if (head1.data <= head2.data) {
            mergedList = head1;
            head1 = head1.next;
        } else  {
            mergedList = head2;
            head2 = head2.next;
        }
        firstNode = mergedList;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                mergedList.next = head1;
                head1 = head1.next;
                mergedList = mergedList.next;
            } else {
                mergedList.next = head2;
                head2 = head2.next;
                mergedList = mergedList.next;
            }
        }
        if (head1 == null && head2 != null) {
            while (head2 != null) {
                mergedList.next = head2;
                head2 = head2.next;
                mergedList = mergedList.next;
            }
        } else if (head1 != null && head2 == null) {
            while (head1 != null) {
                mergedList.next = head1;
                head1 = head1.next;
                mergedList = mergedList.next;
            }
        }
        return firstNode;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode node1V3 = new SinglyLinkedListNode(3, null);
        SinglyLinkedListNode node1V2 = new SinglyLinkedListNode(2, node1V3);
        SinglyLinkedListNode node1V1 = new SinglyLinkedListNode(1, node1V2);

        SinglyLinkedListNode node2V4 = new SinglyLinkedListNode(4, null);
        SinglyLinkedListNode node2V3 = new SinglyLinkedListNode(3, node2V4);

        SinglyLinkedListNode node = mergeLists(node1V1, node2V3);

        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
