// Sliding window & Hashmap:
class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, max = 0;
        for(int right = 0; right < fruits.length; right++){
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            while(map.size() > 2){
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if(map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
            left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
// Time: O(n) — each element is processed at most twice.
// Space: O(1) — map holds at most 2 types at any time.
