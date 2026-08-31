class Solution {

    List<Integer> ans = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {

        if (root == null) {
            return ans;
        }

        rightView(root, 0);

        return ans;
    }

    public void rightView(TreeNode root, int level) {

        if (root == null) {
            return;
        }

        // Is level par pehli baar node mili
        if (level == ans.size()) {
            ans.add(root.val);
        }

        // Pehle RIGHT side jao
        if (root.right != null) {
            rightView(root.right, level + 1);
        }

        // Agar right nahi hai / right side cover nahi hui,
        // LEFT side jao
        if (root.left != null) {
            rightView(root.left, level + 1);
        }
    }
}