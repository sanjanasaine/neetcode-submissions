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

class Solution 
{
    public int diameterOfBinaryTree(TreeNode root) 
    {
        if(root == null)
          return 0;
         Stack<TreeNode> stack = new Stack<>();
         Map<TreeNode , Integer> height = new HashMap<>();

         stack.push(root);
         int diameter = 0;

         while(!stack.isEmpty())
         {
            TreeNode curr = stack.peek();

            if(curr.left != null && !height.containsKey(curr.left ))
               stack.push(curr.left);

            else if(curr.right != null && !height.containsKey(curr.right))
               stack.push(curr.right);

            else
            {
                int lh = height.getOrDefault(curr.left,0);
                int rh = height.getOrDefault(curr.right, 0);

                diameter = Math.max(diameter, lh + rh);

                height.put(curr, 1 + Math.max(lh , rh));

                stack.pop();
            }
         }

         return diameter;    
    }
}
