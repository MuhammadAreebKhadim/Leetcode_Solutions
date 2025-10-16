class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] count = new int[value];
        for(int num : nums){
            int remainder = ((num % value) + value) % value;
            count[remainder]++;
        }
        for(int i = 0; i < nums.length; i++){
            int remainder = i % value;
            count[remainder]--;
            if(count[remainder] < 0) return i;
        }
        return nums.length;
    }
}