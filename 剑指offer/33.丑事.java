public int GetUglyNumber_Solution(int index) {
        if(index==0) return 0;
        int min1=2,min2=3,min3=5;
        int num[]=new int[index];
        num[0]=1;
        int i=0;
        int p2=0,p3=0,p4=0;
        for(i=1;i<index;i++){
            num[i]=Math.min(min1,Math.min(min2,min3));
            if(num[i]==min1) min1=num[++p2]*2;
            if(num[i]==min2) min2=num[++p3]*3;
            if(num[i]==min3) min3=num[++p4]*5;
        }
        return num[index-1];
    }