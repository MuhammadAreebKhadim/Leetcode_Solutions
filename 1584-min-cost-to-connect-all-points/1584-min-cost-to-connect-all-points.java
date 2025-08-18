class Solution {
  public int minCostConnectPoints(int[][] points) {
    int n = points.length;
    boolean[] visited =  new boolean[n];
    int use_edge = 0;
    int total_cost = 0;
    PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
    pq.offer(new int[]{0, 0});
    while(use_edge < n){
      int[] current = pq.poll();
      int cost = current[0], node = current[1];
      if(visited[node]) continue;
      visited[node] = true;
      total_cost += cost;
      use_edge++;
      for(int next = 0; next < n; next++){
        if(!visited[next]){
          int next_cost = Math.abs(points[node][0] - points[next][0]) + Math.abs(points[node][1] - points[next][1]);
          pq.offer(new int[]{next_cost, next});
        }
      }
    }
    return total_cost;
  }
}