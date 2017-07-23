

public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> > result=new ArrayList<ArrayList<Integer> >();
        if(pRoot==null) return result;
        Queue<TreeNode> left=new LinkedList<TreeNode>();
        left.add(pRoot);
        Queue<TreeNode> right=new LinkedList<TreeNode>();
        return fun(result,left,right);
    }
    public ArrayList<ArrayList<Integer> > fun(ArrayList<ArrayList<Integer> > result,Queue<TreeNode> left,Queue<TreeNode> right){
        if(left.isEmpty()){
            ArrayList<Integer> node=new ArrayList<Integer>();
            while(!right.isEmpty()){
                TreeNode x=right.poll();
                node.add(x.val);
                if(x.left!=null)left.offer(x.left);
                if(x.right!=null)left.offer(x.right);
            }
            result.add(node);
        }else {
      ArrayList<Integer> node=new ArrayList<Integer>();
            while(!left.isEmpty()){
                TreeNode x=left.poll();
                node.add(x.val);
                if(x.left!=null)right.offer(x.left);
                if(x.right!=null)right.offer(x.right);
              
            }
            result.add(node);
        }
        if(left.isEmpty()&&right.isEmpty()) return result;
        else fun(result,left,right);  
        return result;
    }