    public boolean VerifySquenceOfBST(int [] sequence) {
        int length=sequence.length-1;
        if(length==0) return true;
        if(length==-1) return false;
        return fun(sequence,0,length);
    }
    public static boolean fun(int[] sequence,int x,int length){
        int root=sequence[length];
        int t=x;
        
        while(sequence[x]<root) x++;
        int i=x;
        while(i<length){
            if(root>sequence[i]) return false;
            i++;
        }
        boolean left=true;
        if(x-t>1) left=fun(sequence,0,x-1);
        boolean right=true;
        if(length-x>1) right=fun(sequence,x,length-1);
        return left&&right;
    }