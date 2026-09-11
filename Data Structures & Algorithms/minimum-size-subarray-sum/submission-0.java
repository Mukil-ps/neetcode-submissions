class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int minwindow=Integer.MAX_VALUE;
        int currentsum=0;
        for(right=0;right<nums.length;right++){
            currentsum+=nums[right];
            while(currentsum>=target){
                int window=right-left+1;
                minwindow=Math.min(window,minwindow);
                currentsum-=nums[left];
                left++;
            }
        }
        return minwindow==Integer.MAX_VALUE?0:minwindow;
    }
}