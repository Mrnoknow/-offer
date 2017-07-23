 TreeNode node;
    int t;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        t=k;
        fun(pRoot);
        return node;
    }
    void fun(TreeNode pRoot){
        if(pRoot==null||t==0) return ;
        fun(pRoot.left);
        if(t==0) return ;
        if(--t==0) {node=pRoot; return;}
        if(t==0) return ;
        fun(pRoot.right);
        return ;
    }