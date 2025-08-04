// Iterate over the array in steps of 2; for each pair [freq, val], add val freq times.
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int totalLen = 0;
        for(int i = 0; i < nums.length; i += 2){
            totalLen += nums[i];
        }
        int[] result = new int[totalLen];
        int index = 0;
        for(int i = 0; i < nums.length; i += 2){
            int fre = nums[i];
            int val = nums[i + 1];
            for(int j = 0; j < fre; j++){
                result[index++] = val;
            }
        }
        return result;
    }
}

// Time: O(n)
// Space: O(n)
