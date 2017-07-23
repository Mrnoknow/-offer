  public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> > result=new ArrayList<ArrayList<Integer> >();
        if(pRoot==null) return result;
        Stack<TreeNode> left=new Stack<TreeNode>();
        left.push(pRoot);
        Stack<TreeNode> right=new Stack<TreeNode>();
        return fun(result,left,right);
    }
    public ArrayList<ArrayList<Integer> > fun(ArrayList<ArrayList<Integer> > result,Stack<TreeNode> left,Stack<TreeNode> right){
        if(left.empty()){
            ArrayList<Integer> node=new ArrayList<Integer>();
            while(!right.empty()){
                TreeNode x=right.pop();
                node.add(x.val);
                if(x.right!=null)left.push(x.right);
                if(x.left!=null)left.push(x.left);
            }
            result.add(node);
        }else {
      ArrayList<Integer> node=new ArrayList<Integer>();
            while(!left.empty()){
                TreeNode x=left.pop();
                node.add(x.val);
                if(x.left!=null)right.push(x.left);
                if(x.right!=null)right.push(x.right);
              
            }
            result.add(node);
        }
        if(left.empty()&&right.empty()) return result;
        else fun(result,left,right);  
        return result;
    }
