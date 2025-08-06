// Bit Manupliation: n = 8(1000); n-1 = 7(0111); 1000 & 0111 = 0000 
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & ( n-1)) == 0;
// Time = O(1)
// Space = O(1)


        
        // if (n <= 0) return false;
        // while (n != 1 ) {
        //     if(n % 2 != 0){
        //       return false;  
        //     }
        //     n = n / 2; 
        // }
        // return true;
    }
}
