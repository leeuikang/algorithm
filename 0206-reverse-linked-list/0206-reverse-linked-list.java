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
    ListNode temp = new ListNode();

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        dfs( head, head.next);
        return temp;
    }
    
    public void dfs(ListNode pre, ListNode next){
        
        if(next.next == null){
            temp = next;
            next.next = pre;
            pre.next = null;

            return;
        }
        
        dfs(pre.next, next.next);
    
        next.next = pre;
        pre.next = null;

    }
}