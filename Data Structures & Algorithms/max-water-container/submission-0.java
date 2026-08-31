class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxw=0;
        while(left<right){
            maxw=Math.max(maxw,Math.min(heights[left],heights[right])*(right-left));
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxw;
    }
}
