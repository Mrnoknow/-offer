    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> array=new ArrayList<Integer>();
        if(root==null) return array;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        while(queue.size()!=0){
            TreeNode fun=queue.element();
            array.add(fun.val);
            if(fun.left!=null) queue.add(fun.left);
            if(fun.right!=null) queue.add(fun.right);
            queue.remove();
        }
        return array;
        
    }