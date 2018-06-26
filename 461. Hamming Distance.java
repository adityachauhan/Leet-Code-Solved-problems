class Solution {
    public int hammingDistance(int x, int y) {
        int n = x ^ y;
        int res = Integer.bitCount(n);
        return res;
    }
}
