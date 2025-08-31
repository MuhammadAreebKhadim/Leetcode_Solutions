class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer>  freq = new HashMap<>();
        freq.put(0, 1);
        int count  = 0, prefixsum = 0;
        for(int num : nums){
            prefixsum += num % 2;
            if(freq.containsKey(prefixsum - k)){
                count  += freq.get(prefixsum - k);
            } 
            freq.put(prefixsum, freq.getOrDefault(prefixsum, 0) + 1);
        } 
        return count;
    }
}