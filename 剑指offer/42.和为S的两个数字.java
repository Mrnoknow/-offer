 public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int length=array.length;
        ArrayList<Integer> num=new ArrayList<Integer>();
        if(length<2) return num;
        int start=0;
        int end=length-1;
        int result;
        while(start<end){
            result=array[start]+array[end];
            if(result>sum){
                end--;
            }else if(result<sum){
                start++;
            }else if(result==sum){
                num.add(array[start]);
                num.add(array[end]);
                return num;
            }
        }
        return num;
    }