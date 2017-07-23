    public void Mirror(TreeNode root) {
        if(root==null) return;
        TreeNode tree=root.left;
        root.left=root.right;
        root.right=tree;
        Mirror(root.left);
        Mirror(root.right);
    }