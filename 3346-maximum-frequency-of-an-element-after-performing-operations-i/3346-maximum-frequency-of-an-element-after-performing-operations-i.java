// Difference Array + Sweep Line:
class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        HashMap<Integer, Integer> count = new HashMap<>();
        // difference map for ranges [x - k, x + k]
        TreeMap<Integer, Integer> diff = new TreeMap<>();
        for (int x : nums) {
            count.put(x, count.getOrDefault(x, 0) + 1);

            int start = x - k;
            int endPlusOne = x + k + 1;
            diff.put(start, diff.getOrDefault(start, 0) + 1);
            diff.put(endPlusOne, diff.getOrDefault(endPlusOne, 0) - 1);
            diff.putIfAbsent(x, diff.getOrDefault(x, 0));
        }
        int ans = 0;
        int running = 0; 
        for (Map.Entry<Integer, Integer> e : diff.entrySet()) {
            int t = e.getKey();
            running += e.getValue();        
            int already = count.getOrDefault(t, 0);
            int possible = Math.min(running, already + numOperations);
            ans = Math.max(ans, possible);
        }
        return ans;


// Brute Force:(Incorrect due to TLE)
        // Map<Integer, Integer> frequency = new HashMap<>();
        // for(int x : nums){
        //     for(int val = x-k; val <= x+k; val++){
        //         frequency.put(val, frequency.getOrDefault(val, 0) + 1);
        //     }
        // }
        // int ans = 0;
        // for(int target : frequency.keySet()){
        //     int already = 0;
        //     for(int x : nums){
        //         if(x == target) already++;
        //     }
        // int canConvert = frequency.get(target) - already;
        // int total = already + Math.min(canConvert, numOperations);
        // ans = Math.max(ans, total);
        // }
        // return ans;

// Sliding Window: (Incorrect due to some test cases wrong)
        // Arrays.sort(nums);
        // int left = 0, ans = 1;
        // for(int right = 0; right < nums.length; right++){
        //     while(nums[right] - nums[left] > 2 * k){
        //         left++;
        //     }
        // int size = right - left + 1;
        // int total = Math.min(size, 1 + numOperations);
        // ans = Math.max(ans, total);
        // }
        // return ans;
    }
}