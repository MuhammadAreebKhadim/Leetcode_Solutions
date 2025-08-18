class Solution {
  public int networkDelayTime(int[][] times, int n, int k) {
    List<int[]>[] graph = new ArrayList[n+1];
    for(int i = 1; i <= n; i++) graph[i] = new ArrayList<>();
    for(int[] edges : times){
      graph[edges[0]].add(new int[]{edges[1], edges[2]});
    }
    PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
    pq.offer(new int[]{0, k});

    int[] distance = new int[n+1];
    Arrays.fill(distance, Integer.MAX_VALUE);
    distance[k] = 0;
    while(!pq.isEmpty()){
      int[] current = pq.poll();
      int time = current[0], node = current[1];
      if(time > distance[node]) continue;
      for(int[] edge  : graph[node]){
        int neighbor = edge[0], w = edge[1];
        if(distance[neighbor] > time + w){
          distance[neighbor] = time + w;
          pq.offer(new int[]{distance[neighbor], neighbor});
        }
      }
    }
    int ans = 0;
    for(int i = 1; i <= n; i++){
      if(distance[i] == Integer.MAX_VALUE) return -1;
      ans = Math.max(ans, distance[i]);
    }
    return ans;
  }
}