class Solution {
    public String removeStars(String s) {
        Stack<Character> st  = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '*'){
                st.pop();
            } else{
                st.push(c);
            }
        }
        StringBuilder res = new StringBuilder();
        for(char ch : st){
            res.append(ch);
        }
        return res.toString();
    }
}