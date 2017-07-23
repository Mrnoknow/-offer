public int FindGreatestSumOfSubArray(int[] array) {
        int length=array.length;
        if(length==0) return 0;
        if(length==1) return array[0];
        int result=0;
        int i=0;
        int max = array[0];
        while(i<length){
            result+=array[i];
            if(result>max) max=result;
            if(result<0) result=0;
            i++;
        }
        return max;
    }