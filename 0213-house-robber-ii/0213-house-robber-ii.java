class Solution {
    public int roblinear(int[] nums, int start, int end){
        int previous2 = 0, previous1 = 0;
        for(int i = start; i <= end; i++){
            int current = Math.max(previous1, previous2 + nums[i]);
            previous2 = previous1;
            previous1 = current;
        }
        return previous1;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        int case1 = roblinear(nums, 0, n-2);
        int case2 = roblinear(nums, 1, n-1);
        return Math.max(case1, case2);
    }
}