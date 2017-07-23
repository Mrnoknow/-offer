    int Fibonacci(int n) {
        if(n==0) return 0;
        int num=1;
        int m=0;
        while(--n){
            num+=m;
            m=num-m;
        }
        return num;
    }