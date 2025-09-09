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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for(ListNode node : lists){
            if(node != null) pq.offer(node);
        }
        ListNode dummy = new ListNode(0); 
        ListNode current = dummy;
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            current.next = node;
            current = current.next;
            if(current.next != null){
                pq.offer(current.next);
            }
        }
        return dummy.next;
    }
}