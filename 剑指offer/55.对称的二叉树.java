boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null) return true;
        return Fun(pRoot.left,pRoot.right);
    }
    boolean Fun(TreeNode left,TreeNode right){
        if(left==null || right==null) {
            if(left==null && right==null) return true;
            else return false;
        }
        
        if(left.val==right.val){
            return Fun(left.left,right.right)&&Fun(left.right,right.left);
        }else return false;
    }