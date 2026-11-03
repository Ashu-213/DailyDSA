class Solution {
    public int[] rowAndMaximumOnes(int[][] arr) {
        int n = arr.length;
        int maxOnes = -1, maxRow = 0;

        for(int i=0;i<n;i++){
            int ones = 0;
            for(int val : arr[i]){
                if(val == 1) ones++;
            }

            if(ones > maxOnes){
                maxOnes = ones;
                maxRow = i;
            }
        }

        int[] ans = new int[2];
        ans[0] = maxRow;
        ans[1] = maxOnes;
        return ans;
    }
}