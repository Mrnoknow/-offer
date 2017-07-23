public boolean isContinuous(int [] numbers) {
        if(numbers.length<5) return false;
        int num[]=new int[14];
        for(int i=0;i<5;i++){
            num[numbers[i]]++;
        }
        int flag=0;
        for(int i=1;i<14;i++){
            if(num[i]>1) return false;
            if(flag!=0){
                if(num[i]==1) flag++;
                else if(num[0]!=0) {num[0]--; flag++;}
                else return false;
            }else if(num[i]==1){
                flag++;
            }
            if(flag==5) return true;
        }
        return false;
    }