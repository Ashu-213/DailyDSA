class Solution {
    public int[][] updateMatrix(int[][] mat) {
        if(mat == null || mat.length == 0 || mat[0].length == 0){
            return new int[0][0];
        }
        int m = mat.length, n = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        int MAX_VALUE = m*n;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] == 0){
                    q.offer(new int[]{i,j});
                }else{
                    mat[i][j] = MAX_VALUE;
                }
            }
        }
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while(!q.isEmpty()){
            int[] cell = q.poll();
            for(int[] dir: directions){
                int row = cell[0] + dir[0], col = cell[1] + dir[1];

                if (row >= 0 && row < m && col >= 0 && col < n && mat[row][col] > mat[cell[0]][cell[1]] + 1) {
                    q.offer(new int[]{row, col});
                    mat[row][col] = mat[cell[0]][cell[1]] + 1;
                }
            }
        }
        return mat;
    }
}