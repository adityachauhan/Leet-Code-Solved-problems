class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int max = A[0], key = 0;
        for(int i=1;i<A.length;i++){
            if(A[i] > max){
                max = A[i];
                key = i;
            }
        }
        return key;
    }
}
