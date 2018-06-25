class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int[] ar = new int[nums.length];
        int j=0;
        Arrays.fill(ar,0);
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            if(nums[i]==0 || i==nums.length-1){
                ar[j]=count;
                j++;
                count=0;
            }
            
        }
        //for(int i=0;i<nums.length;i++){
          // System.out.println(ar[i]);
        //}
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(max < ar[i]){
                max = ar[i];
            }
        }
        return max;
    }
}
