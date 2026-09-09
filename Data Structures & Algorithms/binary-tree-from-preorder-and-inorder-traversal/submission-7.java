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
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
       if(preorder.length == 0)
         return null;
       
       int rootVal = preorder[0];
       TreeNode root = new TreeNode(rootVal);

       int index = 0;
       while(inorder[index] != rootVal)
       {
         index++;
       }

       int[] inleft = Arrays.copyOfRange(inorder, 0 , index );
       int[] inright = Arrays.copyOfRange(inorder , index + 1, inorder.length );

       int[] preleft = Arrays.copyOfRange(preorder , 1, index + 1);
       int[] preright = Arrays.copyOfRange(preorder, index + 1, preorder.length );

       root.left = buildTree(preleft, inleft);
       root.right = buildTree(preright , inright);
       return root;

    }
}
