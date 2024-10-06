class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         // Step 1: Find the size of the linked list
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }    

        // Step 2: Handle base case where the head needs to be removed
        if (n == size) {
            head = head.next;
            return head;
        }
         // Step 3: Find the position of the node to be removed from the beginning
        int positionToRemove = size - n + 1;

        ListNode prev = null;
        temp = head;
        for (int i = 1; i < positionToRemove; i++) {
            prev = temp;
            temp = temp.next;
        }

        // Step 5: Remove the node
        prev.next = temp.next;

        return head;
    }
}