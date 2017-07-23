 public int[] multiply(int[] A) {
        int length=A.length;
        int B[]=new int[length];
        int C[]=new int[length];
        if(length<1) return B;
        int sum=1;
        B[0]=1;
        for(int i=1;i<length;i++){
            B[i]=B[i-1]*A[i-1];
        }
        int tem=1;
        for(int i=length-2;i>=0;i--){
            tem*=A[i+1];
            B[i]*=tem;
        }
        return B;
    }