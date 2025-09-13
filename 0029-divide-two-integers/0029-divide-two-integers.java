class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        return (dividend/divisor);
        // long a = Math.abs((long) dividend);
        // long b = Math.abs((long) divisor);
        // int result = 0;
        // while(a >= b){
        //     long temp = b;
        //     long multiple = 1;
        //     while((temp << 1) <= a){
        //         temp <<= 1;
        //         multiple <<= 1;
        //     }
        //     a -= temp;
        //     result += multiple;
        // }
        // if((dividend < 0) ^ (divisor < 0)){
        //     return -result;
        // } 
        // return result;
    }
}