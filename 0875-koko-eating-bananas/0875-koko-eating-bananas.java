class Solution {
    public boolean canEatInTime(int[] piles, int h, int speed){
        int hours = 0;
        for(int pile : piles){
            hours += (pile + speed - 1) / speed;
        }
        return hours <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;
        for(int pile : piles){
            high = Math.max(high, pile);
        }
        while(low < high){
            int mid = low + (high - low) / 2;
            if(canEatInTime(piles, h, mid)){
                high = mid;
            } else{
                low = mid + 1;
            }
        }
        return low;
    }
}