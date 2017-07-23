int jumpFloorII(int number) {
        if(number==0) return 0;
        int num=1;
        return num<<(number-1);
    }