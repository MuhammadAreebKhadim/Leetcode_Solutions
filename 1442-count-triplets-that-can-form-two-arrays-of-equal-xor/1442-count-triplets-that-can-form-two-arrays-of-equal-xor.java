class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int ans = 0;
        int prefix = 0;
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> total = new HashMap<>();
        count.put(0, 1);
        total.put(0, 0);
        for(int i = 0; i < n; i++){
            prefix ^= arr[i];
            if(count.containsKey(prefix)){
                ans += i * count.get(prefix) - total.get(prefix);
            }
            count.put(prefix, count.getOrDefault(prefix, 0) + 1);
            total.put(prefix, total.getOrDefault(prefix, 0) + (i + 1));
        }
        return ans;
    }
}