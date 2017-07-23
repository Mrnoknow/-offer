 int jumpFloor(int number) {
        if(number==0) return 0;
        int num=1;
        int n=0;
        while(--number){
            num+=n;
            n=num-n;
        }
        return num;
    }