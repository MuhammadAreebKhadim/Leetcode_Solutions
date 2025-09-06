class Solution {
    public int findClosest(int x, int y, int z) {
        int distanceX = Math.abs(x - z);
        int distanceY = Math.abs(y - z);
        if(distanceX == distanceY) return 0;
        return distanceX < distanceY ? 1 : 2;
    }
}