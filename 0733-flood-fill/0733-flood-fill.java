class Solution {
    public void dfs(int[][] image, int r, int c, int color, int new_color){
        if(r < 0 || r >= image.length || c < 0 || c >= image[0].length) return;
        if(image[r][c] != color) return;
        image[r][c] = new_color;
        dfs(image, r+1, c, color, new_color);
        dfs(image, r-1, c, color, new_color);
        dfs(image, r, c+1, color, new_color);
        dfs(image, r, c-1, color, new_color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original_color = image[sr][sc];
        if(original_color != color){
            dfs(image, sr, sc, original_color, color);
        }
        return image;
    }
}