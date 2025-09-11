class Solution {
    public int longestConsecutive(int[] nums) {
        // T & S : O(N)
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int longest = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int currentnum = num;
                int streakcount = 1;
                while(set.contains(currentnum + 1)){
                    currentnum++;
                    streakcount++;
                }
            longest = Math.max(longest, streakcount);
            }
        }
        return longest;






    // T = Olog(n) & S = O(1):
        // if(nums.length == 0) return 0;
        // Arrays.sort(nums);
        // int longest = 1, streakcount = 1;
        // for(int i = 1; i < nums.length; i++){
        //     if(nums[i] == nums[i-1]) continue;
        //     if(nums[i] == nums[i-1] + 1){
        //         streakcount++;
        //     } else{
        //         longest = Math.max(longest, streakcount);
        //         streakcount = 1;
        //     }
        // }
        // return Math.max(streakcount, longest);
    }
}