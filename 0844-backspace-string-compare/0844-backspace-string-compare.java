class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    private String build(String str){
        StringBuilder res = new StringBuilder();
        for(char c : str.toCharArray()){
            if(c != '#'){
                res.append(c);
            } else if(res.length() > 0){
                res.deleteCharAt(res.length() - 1);
            }
        }
        return res.toString();
    }
}