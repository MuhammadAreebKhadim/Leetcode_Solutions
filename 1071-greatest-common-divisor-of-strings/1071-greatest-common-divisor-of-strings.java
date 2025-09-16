class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) return "";
        int divisor_length = good_divisor(str1.length(), str2.length());
        return str1.substring(0, divisor_length);
    }
    private int good_divisor(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}