class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers==null || numbers.length==0)
            return null;
        int i=0, j=numbers.length-1;
        while(i<j){
            int n = numbers[i] + numbers[j];
            if(n<target){
                i++;
            }
            else if(n>target){
                j--;
            }
            else{
                return new int[] {i+1, j+1};
            }
        }
        return null;
    }
}
