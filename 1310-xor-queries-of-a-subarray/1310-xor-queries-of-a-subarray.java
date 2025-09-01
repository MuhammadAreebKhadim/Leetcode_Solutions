class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n  = arr.length;
        int[] prefixXOR = new int[n];
        prefixXOR[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefixXOR[i] = prefixXOR[i-1] ^ arr[i];
        }
        int[] result = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0], end = queries[i][1];
            if(start == 0){
                result[i] = prefixXOR[end]; 
            } else{
                result[i] = prefixXOR[end] ^ prefixXOR[start - 1];
            }
        }
        return result;
    }
}