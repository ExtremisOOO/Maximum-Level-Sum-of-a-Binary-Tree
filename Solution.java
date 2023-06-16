
class Solution {
    public int maxLevelSum(TreeNode root) {
        int[] nums = new int[100];
        int helpNumer = Integer.MIN_VALUE;
        int output = 0;

        inOrder(root,0,nums);

        for (int i = 0; i < nums.length; i++) {
             if(nums[i]==0 && nums[i+1]==0)
                break;
             else if(nums[i]>helpNumer){
                helpNumer = nums[i];
                output = i;
             }
        }
        return output+1;
    } 

    private void inOrder(TreeNode root,int level,int[] nums){
        if(root.left!=null) inOrder(root.left,level+1,nums);
        nums[level]+=root.val;
        if(root.right!=null) inOrder(root.right,level+1,nums);
    }
}