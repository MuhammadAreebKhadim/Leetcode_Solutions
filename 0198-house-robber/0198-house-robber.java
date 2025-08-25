// class Solution {
//     public int rob(int[] nums) {
//         int n = nums.length;
//         if(n == 1) return nums[0];
//         int[] rob = new int[n];
//         rob[0] = nums[0];
//         rob[1] = Math.max(nums[0], nums[1]);
//         for(int i = 2; i < n; i++){
//             rob[i] = Math.max(rob[i - 1], rob[i - 2] + nums[i]);
//         }
//         return rob[n - 1];
//     }
// }
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int pre2 = nums[0];
        int pre1 = Math.max(nums[0], nums[1]);
        for(int i = 2; i < n; i++){
            int current = Math.max(pre1, pre2 + nums[i]);
            pre2 = pre1;
            pre1 = current;
        }
        return pre1;
    }
}