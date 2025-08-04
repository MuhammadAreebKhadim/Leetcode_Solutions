// Use Floyd’s Tortoise and Hare (cycle detection) algorithm, as array values form a linked list with a cycle.
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

// Time: O(n)
// Space: O(1)
