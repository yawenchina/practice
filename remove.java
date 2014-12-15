/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n <= 0){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode move = head;
        while( n > 0){
            if(move == null){
                return null;
            }
            move = move.next;
            n--;
        }
        ListNode slow = dummy;
        while(move != null){
            slow = slow.next;
            move = move.next;
        }
        
        slow.next = slow.next.next;
        return dummy.next;
        
    }
}