/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
public class Solution {
  public ListNode reverse(ListNode head) {
    ListNode pre = null;
    if(head == null || head.next == null){
      return head;
    }
    while(head != null){
      ListNode next = head.next;
      head.next = pre;
      pre = head;
      head = next;
    }
    return pre;
  }
}