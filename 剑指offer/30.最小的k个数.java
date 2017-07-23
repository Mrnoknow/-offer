public  ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        int length=input.length;
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(length==0||k==0||k>length) return result;
        Fun(input,0,length-1,k-1);
        for(int i=0;i<k;i++){
            result.add(input[i]);
        }
        return result;
    }
    public  void Fun(int []input,int low,int high,int k){
        if(low>=high) return;
        int num=low;
        int fun=input[low];
        int x=high;
        while(low<high){
            while(low<high&&input[high]>=fun) high--;
            while(low<high&&input[low]<=fun) low++;
            if(low<high){
                int tem=input[low];
                input[low]=input[high];
                input[high]=tem;
            }
        }
        input[num]=input[low];
        input[low]=fun;
        if(low==k) return;
        else if(low<k) Fun(input,low+1,x,k);
        else if(low>k) Fun(input,num,low-1,k);
    }