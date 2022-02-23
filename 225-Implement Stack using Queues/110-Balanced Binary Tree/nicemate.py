# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def get_height(self, node: Optional[TreeNode]) -> int:
        if node is None:
            return 0
        
        left_height = self.get_height(node.left)
        if left_height < 0:
            return -1
        
        right_height = self.get_height(node.right)
        if right_height < 0:
            return -1
        
        if abs(left_height - right_height) > 1:
            return -1
        
        return max(left_height, right_height) + 1
    
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        return self.get_height(root) >= 0
    
