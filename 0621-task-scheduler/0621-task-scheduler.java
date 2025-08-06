class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char task : tasks){
            freq[task - 'A']++;
        }
        Arrays.sort(freq);
        int maxfreq = freq[25];
        int maxcount = 1;
        for(int i = 24; i >= 0; i--){
            if(freq[i] == maxfreq){
                maxcount++;
            } else{
                break;
            }
        }
        int mintime = (maxfreq - 1) * (n + 1) + maxcount;
        return Math.max(mintime, tasks.length);
    }
}