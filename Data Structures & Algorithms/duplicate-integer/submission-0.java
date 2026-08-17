class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int arr:nums){
            if(map.containsKey(arr)){
                map.put(arr,map.get(arr)+1);
            }else{
                map.put(arr,1);
            }
            if(map.get(arr)>1){
                return true;
            }
        }
        return false;
    }
}