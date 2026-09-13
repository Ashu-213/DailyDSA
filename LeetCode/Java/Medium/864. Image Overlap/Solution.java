class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        List<int[]> list1 = new ArrayList<>();
        List<int[]> list2 = new ArrayList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(img1[i][j] == 1) list1.add(new int[]{i, j});
                if(img2[i][j] == 1) list2.add(new int[]{i, j});
            }
        }
        int[][] cnt = new int[2*n][2*n];
        int best = 0;
        for(int[] l1 : list1){
            for(int[] l2 : list2){
                int dx = l2[0] - l1[0] + n;
                int dy = l2[1] - l1[1] + n;
                best = Math.max(best, ++cnt[dx][dy]);
            }
        }
        return best;
    }
}