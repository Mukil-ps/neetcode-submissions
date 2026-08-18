class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;
        for(int arr:nums){
            if(count==0){
                candidate=arr;
            }
            if(arr==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}