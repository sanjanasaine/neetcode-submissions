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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
           
           List<List<Integer>> answer = new ArrayList<>();
           if(root == null)
              return answer;

           Queue<TreeNode> temp = new LinkedList<>();
           temp.add(root);

           while(!temp.isEmpty())
           {
              ArrayList<Integer> ans = new ArrayList<>();
              int size = temp.size();
              for(int i =0 ; i < size; i++ )
              {
                   TreeNode curr = temp.poll();
                   ans.add(curr.val);

                   if(curr.left != null)
                        temp.add(curr.left);

                   if(curr.right != null)
                        temp.add(curr.right);
              }
              answer.add(ans);    
           } 


           return answer;  
    }
}
 