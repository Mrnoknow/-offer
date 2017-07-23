 public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int num=0;
        int length=array.length;
        for(int i=0;i<length;i++){
            num^=array[i];
        }
        int one=FindOne(num);
        num1[0]=num2[0]=0;
        for(int i=0;i<length;i++){
            if( ((array[i]>>one) & 1) == 1){
                num1[0]^=array[i];
            }else num2[0]^=array[i];
        }
    }
    public int FindOne(int num){
        int result=0;
        while((num&1)==0){
            num>>=1;
            result++;
        }
        return result;
    }