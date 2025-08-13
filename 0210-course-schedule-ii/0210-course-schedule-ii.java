// Use DFS Topological Method:
class Solution {
    List<List<Integer>> graph;
    int[] visited;
    List<Integer> order;
    boolean hasCycle = false;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());
        for (int[] pre : prerequisites) graph.get(pre[1]).add(pre[0]);
        visited = new int[numCourses];
        order = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) dfs(i);
            if (hasCycle) return new int[0]; // Return empty if cycle detected
        }
        Collections.reverse(order); // Reverse because DFS finishes last course first
        return order.stream().mapToInt(Integer::intValue).toArray();
    }
    private void dfs(int course) {
        if (visited[course] == 1) { // Found a cycle
            hasCycle = true;
            return;
        }
        if (visited[course] == 2) return; // Already processed
        visited[course] = 1; // Mark as visiting
        for (int next : graph.get(course)) {
            dfs(next);
            if (hasCycle) return;
        }
        visited[course] = 2; // Mark as processed
        order.add(course); // Add to result
    }
}

// Time Complexity — O(V + E)
// Space Complexity — O(V + E)
