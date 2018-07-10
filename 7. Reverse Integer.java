class Solution {
    public int reverse(int x) {
        int res = 0;
        while(x!=0){
            int rev = x%10;
            int newres = res*10 + rev;
            if((newres-rev)/10 != res) return 0;
            res = newres;
            x = x/10;
        }
        return res;
    }
}
