  public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return null;
        if(pRootOfTree.right==null&&pRootOfTree.left==null) {return pRootOfTree;}
        TreeNode left=Convert(pRootOfTree.left);
        TreeNode node=left;
        while(node!=null&&node.right!=null){
            node = node.right;
        }
        if(left!=null) {
            node.right=pRootOfTree;
            pRootOfTree.left=node;
        }
        TreeNode right=Convert(pRootOfTree.right);
        if(right!=null){
            pRootOfTree.right = right;
            right.left = pRootOfTree;
        }
        return left!=null?left:pRootOfTree;
    }