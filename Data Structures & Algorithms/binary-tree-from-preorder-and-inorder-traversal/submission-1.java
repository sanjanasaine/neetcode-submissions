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

        int rootValue = preorder[0];  
        TreeNode root = new TreeNode(rootValue);
        
        int index = 0;
        while(inorder[index] != rootValue)
        {
            index++;
        }

        int[] leftIn = Arrays.copyOfRange(inorder, 0 , index);
        int[] rightIn = Arrays.copyOfRange(inorder, index + 1, inorder.length);

        int[] leftPre = Arrays.copyOfRange(preorder, 1, index + 1);
        int[] rightPre = Arrays.copyOfRange(preorder, index + 1 , preorder.length);

        root.left = buildTree(leftPre, leftIn);
        root.right = buildTree(rightPre, rightIn);

        return root;
    }
}
