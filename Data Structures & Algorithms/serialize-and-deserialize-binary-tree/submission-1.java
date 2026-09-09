public class Codec {
    public String serialize(TreeNode root) 
    {
      StringBuilder sb = new StringBuilder();
      helper1(root, sb); 
      return sb.toString();    
    }
    public void helper1(TreeNode root, StringBuilder sb)
    {
        if(root == null)
        {
            sb.append("null,");
            return;
        }

        sb.append(root.val).append(",");
        helper1(root.left, sb);
        helper1(root.right, sb);

        
    }

    
    public TreeNode deserialize(String data) 
    {
       String[] values  = data.split(",");
       int[] index ={0};

       return helper2(values, index);
         
    }
    public TreeNode helper2(String[] values, int[] index)
    {
        if(values[index[0]].equals("null"))
        {
           index[0]++;
           return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(values[index[0]]));
        index[0]++;

        root.left = helper2(values, index);
        root.right = helper2(values, index);

        return root;
    }
}
