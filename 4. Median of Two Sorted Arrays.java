class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        double[] ar = new double[n+m];
        double median=0.0;
        Arrays.fill(ar,0);
        for(int i=0;i<n;i++){
            ar[i] = nums1[i];
        }
        for(int j=n;j<n+m;j++){
            ar[j] = nums2[j-n];
        }
        Arrays.sort(ar);
        for(int i=0;i<n+m;i++){
            System.out.println(ar[i]);
        }
        if((n+m)%2 !=0){
            int index = (((n+m)+1)/2)-1;
            median = ar[index]; 
        }
        else{
            int index1 = ((n+m)/2)-1; 
            int index2 = ((n+m)/2);
            median = (ar[index1]+ar[index2])/2;
        }
        return median;
    }
}
