class Solution:
    '''
    '''
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        left_stack = [root.left]
        right_stack = [root.right]
        left = []
        right = []
        
        if root.left:
            left.append(root.left.val)
        
        if root.right:
            right.append(root.right.val)
        
        while left_stack:
            node = left_stack.pop()
            
            if node:
                left.append(node.val)
                left_stack.append(node.left)
                left_stack.append(node.right)
            else:
                left.append(None)
            
        while right_stack:
            node = right_stack.pop()
            
            if node:
                right.append(node.val)
                
                right_stack.append(node.right)
                right_stack.append(node.left)
            else:
                right.append(None)
        
        return left == right
