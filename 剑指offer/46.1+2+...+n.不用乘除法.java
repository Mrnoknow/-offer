     public  int Sum_Solution(int n) {
        if(n<2) return n;
        int result=1+n;
        int num=n/2;
        int flag=1;
        result=Fun(num,result,flag,1+n);
        if(n%2==1) result+=(n+1)>>1;
        return result;
    }
    public  int Fun(int n,int result,int flag,int num){
      if(n==0) return 0;
        flag=flag<<1;
        if(n<=flag) {result+= Fun((n-(flag>>1)),num,1,num); return result;}
        result=result<<1;
        return Fun(n,result,flag,num);
    }