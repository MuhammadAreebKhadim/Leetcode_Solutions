class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if(indexDiff <= 0 || valueDiff < 0) return false;
        TreeSet<Long> cont = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            long num = nums[i];
            Long small_val = cont.ceiling(num);
            if(small_val != null && small_val - num <= valueDiff) return true;
            Long large_val = cont.floor(num);
            if(large_val != null && num - large_val <= valueDiff) return true;
            cont.add(num);
            if(i >= indexDiff){
                cont.remove((long) nums[i - indexDiff]);
            }
        }
        return false;
    }
}