class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longest = "";
        if(strs.length > 0){
            longest = strs[0];
        }
        for(int i=1;i<strs.length;i++){
            String analyzing = strs[i];
            int j=0;
            for(; j<Math.min(longest.length(), strs[i].length());j++){
                if(longest.charAt(j) != analyzing.charAt(j)){
                    break;
                }
            }
            longest = strs[i].substring(0, j);
        }
        return longest;
    }
}
