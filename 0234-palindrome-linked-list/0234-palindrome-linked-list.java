// fast and slow pointers:
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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        while(slow != null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        while(prev != null){
            if(head.val != prev.val) return false;
            head = head.next;
            prev = prev.next;
        }
        return true;
// Time: O(n)
// Space: O(1)





        // List<Integer> list = new ArrayList<>();
        // ListNode current = head;
        // while(current != null){
        //     list.add(current.val);
        //     current = current.next;
        // }
        // int left = 0;
        // int right = list.size() - 1;
        // while(left < right){
        //     if(list.get(left) != list.get(right)){
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;
    }
}
