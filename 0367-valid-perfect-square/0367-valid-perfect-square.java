// Binary Search:
class Solution {
    public boolean isPerfectSquare(int num) {
        // long left = 1, right = num / 2;
        // while(left <= right){
        //     long mid = left + (right - left) / 2;
        //     long sqr = mid * mid;
        //     if(sqr == num) return true;
        //     else if(sqr < num) left = mid + 1; 
        //     else{
        //         right = mid - 1;
        //     }
        // }
        // return false;


    // Newton-Raphson’s Method (Mathematical Optimization):
        if(num < 2) return true;
        long x = num;
        while(x * x > num){
            x = (x + num / x) / 2;
        }
        return x * x == num;
    }
}