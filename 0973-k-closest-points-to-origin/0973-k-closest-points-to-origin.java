class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Sort Approach:
        Arrays.sort(points, (x, y) -> (x[0]*x[0] + x[1]*x[1]) - (y[0]*y[0] + y[1]*y[1]));
        return Arrays.copyOfRange(points, 0, k);


        // Heap Approach:
        // int[][] res = new int[k][2];
        // PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> (x[0]*x[0] + x[1]*x[1]) - (y[0]*y[0] + y[1]*y[1]));
        // for(int[] p : points){
        //     pq.offer(p);
        // }
        // for(int i = 0; i < k; i++){
        //     res[i] = pq.poll();
        // }
        // return res;
    }
}