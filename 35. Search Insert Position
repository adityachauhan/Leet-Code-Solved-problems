class Solution {
    public int searchInsert(int[] nums, int target) {
        int found = 0;
        int index = 0;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                found = 1;
                index = i;
            }
        }
        if(found==1){
            return index;
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(target < nums[i]){
                    index = i;
                    break;
                }
            }
            if(target > nums[n-1]){
                index = n;
            }
            return index;
        }
    }
}
