class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int half = n/2;
        long total = 0;
        for(int x: nums){
            total += x;
        }
        long winsum = 0;
        for(int i=0; i<half; i++){
            winsum += nums[i];
        }
        int ans=0;
        for(int st = 0; st<n; st++){
            if(2*winsum>total){
                ans++;
            }
            winsum -= nums[st];           
            winsum += nums[(st + half)%n];           
        }
        return ans;
    }
}