    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        int preLength=pre.length;
        int inLength=in.length;
        if(preLength==0||inLength==0) return null;
        if(preLength==1)    return new TreeNode(pre[0]);
        return construct(pre,0,preLength-1,in,0,inLength-1);
        
    }
    public static TreeNode construct(int [] pre,int preStart,int preEnd,int []in,int inStart,int inEnd){
        if(preStart>preEnd) return null;
        int value=pre[preStart];
        int index=inStart;
        while(index<=preEnd&&value!=in[index]) index++;
        TreeNode root=new TreeNode(value);
        root.left=construct(pre,preStart+1,index+preStart-inStart,in,inStart,index-1);
        root.right=construct(pre,preStart+index-inStart+1,preEnd,in,index+1,inEnd);
        return root;
    }