class Solution {
    public boolean CanSplit(int[] nums, int k, int allowedSum){
        int count = 1, currentsum = 0;
        for(int num : nums){
            if(currentsum + num > allowedSum){
                count++;
                currentsum = 0;
            }
            currentsum += num;
        }
        return count <= k;
    }
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        for(int num : nums){
            low = Math.max(low, num);
            high += num;
        }
        while(low < high){
            int mid = low + (high - low) / 2;
            if(CanSplit(nums, k, mid)){
                high = mid;
            } else{
                low = mid + 1;
            }
        }
        return low;
    }
}