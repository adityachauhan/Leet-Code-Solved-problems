class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m+n];
        Arrays.fill(nums3,0);
        for(int i=0;i<m;i++){
            nums3[i] = nums1[i];
        }
        for(int j=m;j<m+n;j++){
            nums3[j] = nums2[j-m];
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i] = nums3[i];
        }
        Arrays.sort(nums1);
        //return nums1;
    }
}
