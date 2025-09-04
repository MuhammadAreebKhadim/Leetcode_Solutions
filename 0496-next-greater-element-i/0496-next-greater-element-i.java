class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> key = new HashMap<>();
        Stack<Integer> container = new Stack<>();
        for(int num : nums2){
            while(!container.isEmpty() && num > container.peek()){
                key.put(container.pop(), num);
            }
            container.push(num);
        }
        while(!container.isEmpty()){
            key.put(container.pop(), -1);
        }
        int[]  res = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            res[i] = key.get(nums1[i]);
        }
        return res;
    }
}