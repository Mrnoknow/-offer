public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null) return true;
        if(Math.abs(IsBalanced(root.left)-IsBalanced(root.right))>1) return false;
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
    public  int IsBalanced(TreeNode root){
        if(root==null) return 0;
        return max(IsBalanced(root.left),IsBalanced(root.right))+1;
    }
    public int max(int a,int b){
        return a>b?a:b;
    }