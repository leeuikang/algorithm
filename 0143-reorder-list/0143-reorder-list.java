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
    public void reorderList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();
        recordNodeListValues(head, list);
        int nIndex = list.size() - 1;
        // 0 , n , 1 , n - 1, 2 , n - 2
        
        for(int i = 0; i < list.size() / 2; i++){
                answerList.add(list.get(i));
                answerList.add(list.get(nIndex - i));
        }
        
        if(list.size() % 2 == 1)
            answerList.add(list.get(nIndex / 2));
        
        for(int val : answerList){
            head.val = val;
            head = head.next;
        }
    }
    
    void recordNodeListValues(ListNode head, List<Integer> list){
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
    }
}