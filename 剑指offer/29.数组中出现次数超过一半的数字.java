  public int MoreThanHalfNum_Solution(int [] array) {
        int length = array.length;
        if (length==0) return 0;
        if (length==1) return array[0];
        int result = 0;
        int time = 0;
        for(int i=0;i<length;i++){
            if(time==0){
                time=1;
                result=array[i];
            }else if(array[i]==result) time++;
            else time--;
        }
        time=0;
        for(int i=0;i<length;i++){
            if(result==array[i]) time++;
        }
        return time>length/2?result:0;
    }