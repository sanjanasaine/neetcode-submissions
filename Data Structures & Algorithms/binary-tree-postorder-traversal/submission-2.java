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
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;
        TreeNode prev = null;

        while( curr != null || !stack.isEmpty())
        {
          while(curr != null)
          {
            stack.push(curr);
            curr = curr.left;
          }

          TreeNode peek = stack.peek();

          if(peek.right != null && peek.right != prev)
             curr = peek.right;

          else
          {
            ans.add(peek.val);
            prev = stack.pop();
          }   
        }

        return ans;
    }
}