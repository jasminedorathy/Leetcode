/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
         ListNode li=new ListNode(0);
        ListNode curr=li;
        int prev=-101;
        while(head != null){
            if(head.next != null && (head.val == head.next.val || head.val== prev)){
                prev=head.val;
            }
            else if(head.val != prev){
                curr.next=new ListNode(head.val);
                curr=curr.next;
            }
            head=head.next;
        }
        return li.next;
        
    }
}