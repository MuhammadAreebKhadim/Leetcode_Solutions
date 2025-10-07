class Solution {
    public int minimumChairs(String s) {
        int current = 0;
        int maxchairs = 0;
        for(char c : s.toCharArray()){
            if(c == 'E'){
                current++;
                maxchairs = Math.max(maxchairs, current);
            } else if(c == 'L'){
                current--;
            }
        }
        return maxchairs;
    }
}