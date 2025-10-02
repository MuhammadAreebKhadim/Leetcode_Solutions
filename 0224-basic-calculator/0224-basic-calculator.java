class Solution {
    int  i = 0;
    private int helper(String s){
        int result = 0;
        int sign = 1;
        int num = 0;
        while(i < s.length()){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num * 10 + (c - '0');
            } else if(c == '+'){
                result += sign * num;
                num = 0;
                sign = 1;
            } else if(c == '-'){
                result += sign * num;
                num = 0;
                sign = -1;
            } else if(c == '('){
                i++;
                num = helper(s);
            } else if(c == ')'){
                result += sign * num;
                return result;
            }
            i++;
        }
        return result + sign * num;
    }
    public int calculate(String s) {
        return helper(s);
    }
}