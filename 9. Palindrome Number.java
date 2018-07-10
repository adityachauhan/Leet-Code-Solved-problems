class Solution {
    public boolean isPalindrome(int x) {
        
        String num = Integer.toString(x);
        int n = num.length();
        for(int i=0;i<n;i++){
            if(num.charAt(i) != num.charAt(n-1-i)){
                return false;
                //break;
            }
        }
        return true;
    }
}
