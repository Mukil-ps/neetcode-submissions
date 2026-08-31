class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int boat=0;
        while(left<=right){  //because till last ppl even that person is 1 we have to find boat
           if(people[left]+people[right]<=limit){
              left++;
           }
           right--;
           boat++;
        }
        return boat;
    }
}