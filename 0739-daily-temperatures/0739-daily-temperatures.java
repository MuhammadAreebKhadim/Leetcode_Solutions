class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
               // Stack is slow than deque:
        // Stack<Integer> stack = new Stack<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int prevday = stack.pop();
                result[prevday] = i - prevday;
            }
            stack.push(i);
        }
        return result;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n) (for the stack and result array)
