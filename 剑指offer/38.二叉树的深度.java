  int max=0;
    public int TreeDepth(TreeNode root) {
        int result=0;
        Fun(root,result);
        return max;
    }
    public void Fun(TreeNode root,int result){
        if(root==null) return ;
        result++;
        Fun(root.left,result);
        Fun(root.right,result);
        if(max<result) max=result;
        result--;
    }