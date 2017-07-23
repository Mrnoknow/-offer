 public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> array=new ArrayList<Integer>();
        int flag=0;
        return Fun(root,result,array,sum,flag);
    }
    public List<List<Integer>> Fun(TreeNode root,List<List<Integer>> result,List<Integer> array,int target,int flag){
        if(root==null) return result;
        flag+=root.val;
        if(root.left==null&&root.right==null){
            if(flag==target){
                array.add(root.val);
                result.add(new ArrayList<Integer>(array));
                array.remove(array.size()-1);
                flag-=root.val;
                return result;
            }
        }else{
            array.add(root.val);
            Fun(root.left,result,array,target,flag);
            Fun(root.right,result,array,target,flag);
            flag-=root.val;
            array.remove(array.size()-1);
        }
        return result;
    }