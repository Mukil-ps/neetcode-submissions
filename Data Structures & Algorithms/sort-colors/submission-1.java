class Solution {
    public void sortColors(int[] nums) {
        int low=0; 
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
           if(nums[mid]==0){
            int temp=nums[low];
            nums[low]=nums[mid];
            nums[mid]=temp;
            low++;
            mid++;
           }else if(nums[mid]==1){
            mid++;
           }else{
            int temp=nums[mid];
            nums[mid]=nums[high];
            nums[high]=temp;
            high--;
           }
        }
       //dutch flag algorithm idea:mid->arr[o]->if arr[0]=2 swap with last element last-- if mid->arr[0]=0 swap low with mid value and low ++ and mid++ if mid->arr[0]==1 then just mid ++ because 1 will be already in the middle 
    }
}