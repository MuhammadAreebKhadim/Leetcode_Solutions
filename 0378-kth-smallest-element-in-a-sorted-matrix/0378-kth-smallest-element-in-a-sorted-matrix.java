class Solution {
    int n;
    int count;
    public int kthSmallest(int[][] matrix, int k) {
        n = matrix.length;
        int low = matrix[0][0], high = matrix[n-1][n-1];
        while(low < high){
            int mid = low + (high - low) / 2;
            count = countlessequal(matrix, mid);
            if(count < k){
                low = mid + 1;
            } else{
                high = mid;
            }
        }
        return low;
    }
    public int countlessequal(int[][] matrix, int mid){
        count = 0;
        int row = n - 1, column = 0;
        while(row >= 0 && column < n){
            if(matrix[row][column] <= mid){
                count += row + 1;
                column++;
            } else{
                row--;
            }
        }
        return count;
    }
}