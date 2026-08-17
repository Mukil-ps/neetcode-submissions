class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first =strs[0];
        String last=strs[strs.length-1];
        String ans="";
        for(int i=0;i<first.length()&&i<last.length();i++){
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }
            ans=ans+first.charAt(i);
        }
        return ans;
    }
}