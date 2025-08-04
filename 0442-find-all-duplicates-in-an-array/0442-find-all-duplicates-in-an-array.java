// sign flipping (negative marking)
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int v : nums) {
            int index = Math.abs(v) - 1;
            if (nums[index] < 0) {
                result.add(Math.abs(v));
            } else {
                nums[index] = -nums[index];
            }
        }
        return result;
    }
}

