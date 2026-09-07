/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isValidBST(TreeNode root) 
    {
        Stack<TreeNode> stack = new Stack<>();
        long prev = Long.MIN_VALUE;

        while(root != null || !stack.isEmpty())
        {
          while(root != null)
          {
            stack.push(root);
            root = root.left;
          }

          TreeNode curr = stack.pop();

          if(curr.val <=  prev) 
            return false;

          prev = curr.val;

          root = curr.right;  
        }

        return true;
    }
}
