class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            while(nums[i] > 0 && nums[i] <= n){
                int correct_pos = nums[i] - 1;
                if(nums[i] == nums[correct_pos]) break;
                int temp = nums[i];
                nums[i] = nums[correct_pos];
                nums[correct_pos] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            if(nums[i] != i + 1){
                return i + 1;
            }
        }
        return n + 1;
    }
}