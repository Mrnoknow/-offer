    String Serialize(TreeNode root) {
        if(root==null) return "";
        StringBuilder result=new StringBuilder();
        fun(result,root);
        return result.toString();
  }
    public void fun(StringBuilder result,TreeNode  root){
         if(root==null){ result.append("#,"); return;}
        result.append(root.val);
        result.append(",");
        fun(result,root.left);
        fun(result,root.right);
    }
    TreeNode Deserialize(String str) {
       String[] data=str.split(",");
        int length=data.length;
        return fun1(data,length);
  }
    int index=-1;
    TreeNode fun1(String str[],int length){
        index++;
         if(index>=length||str[index].equals("#")||str[index].equals("")) return null;
        TreeNode root=new TreeNode(Integer.parseInt(str[index]));
        root.left=fun1(str,length);
        root.right=fun1(str,length); 
        return root;
    }