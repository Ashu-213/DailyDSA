class Solution {
    public boolean uniformArray(int[] nums1) {
        int minodd = Integer.MAX_VALUE;
        for(int i=0; i<nums1.length; i++){
            if(nums1[i] % 2 != 0){
                minodd = Math.min(minodd, nums1[i]);
            }
        }

        for(int i=0; i<nums1.length; i++){
            if(nums1[i] % 2 == 0 && minodd != Integer.MAX_VALUE && nums1[i] < minodd){
                return false;
            }
        }
        return true;
    }
}