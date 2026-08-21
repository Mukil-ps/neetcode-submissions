class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:nums){ //count frequency
           map.put(num,map.getOrDefault(num,0)+1);
        }
        // 2. Get all unique numbers
        Integer[] arr=map.keySet().toArray(new Integer[0]);
        // 3. Sort based on frequency
        Arrays.sort(arr,(a,b)-> map.get(b)-map.get(a));
            // 4. Take first k elements
            int[] ans= new int[k];
            for(int i=0;i<k;i++){
                ans[i]=arr[i];
            }
             return ans;
    }
}
