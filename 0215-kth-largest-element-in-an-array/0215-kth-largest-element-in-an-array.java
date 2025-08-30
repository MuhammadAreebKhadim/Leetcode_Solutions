class Solution {
    public int findKthLargest(int[] nums, int k) {
        // sorting approach:
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n-k];

        // optimal appraoch using heap:
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for(int num : nums){
        //     pq.offer(num);
        //     if(pq.size() > k){
        //         pq.remove();
        //     }
        // }
        // return pq.peek();
    }
}