class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:
        if not nums:
            return None
        
        mid = len(nums) // 2
        
        left_half = nums[:mid]
        right_half = nums[mid + 1:]
        
        bst = TreeNode(val=nums[mid])
        
        bst.left = self.sortedArrayToBST(left_half)
        bst.right = self.sortedArrayToBST(right_half)
        
        return bst
