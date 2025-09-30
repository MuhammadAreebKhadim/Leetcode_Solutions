class Solution {
    public int hammingWeight(int n) {
// Brian Kernighan’s Algorithm:
        int count = 0;
        while(n != 0){  // Loop runs only as many times as there are 1s.
            n &= n - 1;   // removes the lowest set bit from n
            count++;
        }
        return count;
        
    }
}