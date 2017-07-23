  public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null||root2==null) return false;
        boolean result=false;
        if(root1.val==root2.val) result=fun(root1,root2);
        if(!result) result=HasSubtree(root1.left,root2);
        if(!result) result=HasSubtree(root1.right,root2);
        return result;
    }
    public static boolean fun(TreeNode root1,TreeNode root2){
        if(root2==null) return true;
        if(root1==null) return false;
        if(root1.val!=root2.val) return false;
        return fun(root1.left,root2.left)&&fun(root1.right,root2.right);
    }
    