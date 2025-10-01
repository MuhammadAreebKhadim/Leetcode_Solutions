class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> container = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(container.contains(nums[i])){
                return true;
            }
            container.add(nums[i]);
            if(container.size() > k){
                container.remove(nums[i - k]);
            }
        }
        return false;
    }
}