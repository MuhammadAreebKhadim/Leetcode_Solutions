class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int count = 0;
        int end = Integer.MIN_VALUE;
        for(int[] interval : intervals){
            int start = interval[0];
            int finish = interval[1];
            if(start >= end){
                count++;
                end = finish;
            }
        }
        return intervals.length - count;
    }
}