class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String wor : words){
            if(wor.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}
// Time: O(n * m) (n = number of words, m = prefix length)
// Space: O(1)
