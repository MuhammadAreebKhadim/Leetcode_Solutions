class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int v : nums) {
            int idx = Math.abs(v) - 1;
            if (nums[idx] < 0) {
                result.add(Math.abs(v));
            } else {
                nums[idx] = -nums[idx];
            }
        }
        return result;
    }
}

