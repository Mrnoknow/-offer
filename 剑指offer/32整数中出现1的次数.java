public int NumberOf1Between1AndN_Solution(int n) {
        if(n<=0) return 0;
        if(n<10) return 1;
        int pre = 0;
        int result = 0;
        int base= n;
       for(int i=1;i<=n;i*=10){
            pre=n%i;
           if(base%10==1) result+=pre+1;
           if(base%10>1) result+=i;
           base/=10;
           result+=base*i;
       }
        return result;
    }