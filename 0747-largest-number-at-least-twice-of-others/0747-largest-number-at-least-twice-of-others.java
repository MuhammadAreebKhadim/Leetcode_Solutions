class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1, second = -1, index = -1;
        // Find max and second max in one pass
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                second = max;   
                max = nums[i];  
                index = i;        
            } else if (nums[i] > second) {
                second = nums[i]; 
            }
        }
        if (max >= 2 * second) return index;
        return -1;
    }
}
