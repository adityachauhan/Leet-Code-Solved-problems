class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==0)
            return null;
        
        int max=nums[0];
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(max < nums[i]){
                max = nums[i];
                index = i;
            }
        }
        TreeNode node = new TreeNode(max);
        node.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums,0,index));
        node.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums,index+1,nums.length));
        return node;
        
    }
}
