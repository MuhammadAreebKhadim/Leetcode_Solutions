class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<Integer>(), new boolean[nums.length], result);
        return result;
    }
    private void backtrack(int[] nums, List<Integer>perm, boolean[] used, List<List<Integer>> result){
        if(perm.size() == nums.length){
            result.add(new ArrayList<>(perm));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
            used[i] = true;
            perm.add(nums[i]);
            backtrack(nums, perm, used, result);
            perm.remove(perm.size() - 1);
            used[i] = false;
        }
    }
}