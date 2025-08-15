class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        for(int start = 0; start < n; start++){
            if(color[start] != 0) continue;
            Queue<Integer> q = new LinkedList<>();
            color[start] = 1;
            q.offer(start);
            while(!q.isEmpty()){
                int node = q.poll();
                for(int neighbor: graph[node]){
                    if(color[neighbor] == 0){
                        color[neighbor] = 3 - color[node];
                        q.offer(neighbor);
                    } else if(color[neighbor] == color[node]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}