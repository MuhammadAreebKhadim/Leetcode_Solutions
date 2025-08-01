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