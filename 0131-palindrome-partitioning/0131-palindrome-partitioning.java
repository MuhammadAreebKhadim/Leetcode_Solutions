class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtrack(s, 0, new ArrayList<>());
        return res;
    }
    public boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    public void backtrack(String s, int partindex, List<String> sublist){
        if(partindex == s.length()){
            res.add(new ArrayList<>(sublist));
            return;
        }
        for(int end = partindex; end < s.length(); end++){
            if(isPalindrome(s, partindex, end)){
                sublist.add(s.substring(partindex, end + 1));
                backtrack(s, end + 1, sublist);
                sublist.remove(sublist.size() - 1);
            }
        }
    }
}