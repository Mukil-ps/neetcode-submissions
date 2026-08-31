class Solution {
    public void rotate(int[] nums, int k) {
        for(int r=0;r<k;r++){
            int first=nums[nums.length-1];
            for(int i=nums.length-1;i>0;i--){
                nums[i]=nums[i-1];
            }
           nums[0]=first;
        }
    }
}