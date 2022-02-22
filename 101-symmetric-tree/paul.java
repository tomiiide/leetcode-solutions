class Solution {
    
    public boolean isSymmetric(TreeNode root) {
        TreeNode right = root.right;
        TreeNode left = root.left;
        return symetric(right, left);
    }

    public boolean symetric(TreeNode right, TreeNode left) {
        if(right == null && left == null) return true;
        if(right == null && left != null) return false;
        if(left == null && right != null) return false;  
        
        boolean value = symetric(right.left, left.right);
        boolean value2 = symetric(right.right, left.left);
        
        boolean areEqual = right.val == left.val;
        
        return areEqual && (value && value2);
    }
    
}
