class Solution:
    def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:
        if not root:
            return []
        
        current_level = 1
        num_of_level_nodes = 1
        current_level_sum = root.val
        
        queue = [(root, current_level)]
        result = [root.val]
        
        while queue:
            node, level = queue.pop(0)
            
            if level == current_level:
                current_level_sum += node.val
                num_of_level_nodes += 1
                result[len(result) - 1] = current_level_sum / num_of_level_nodes
            else:
                current_level = level
                current_level_sum = node.val
                num_of_level_nodes = 1
                
                result.append(node.val)
                
            
            if node.left:
                queue.append((node.left, level + 1))
                
            if node.right:
                queue.append((node.right, level + 1))
        
        return result
