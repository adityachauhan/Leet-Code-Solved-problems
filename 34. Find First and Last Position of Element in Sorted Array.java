class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ar = new int[2];
        if(nums.length == 0){
            ar[0] = -1;
            ar[1] = -1;
        }
        else{
        int i=0;
        while(i < nums.length-1 && nums[i]!=target){
            i++;
        }
        int index1 = i;
            //System.out.println(i);
        int j=i+1;
            //System.out.println(j);
        while(j < nums.length && nums[j]==target){
            j++;
        }
            //System.out.println(i);
        int index2 = j-1;
        if(i==nums.length-1 && j == nums.length && nums[i] != target){
            ar[0] = -1;
            ar[1] = -1;
        }
        if(i <= j && nums[i]==target){
            ar[0] = index1;
            ar[1] = index2;
        }
        }
        return ar;
    }
}
