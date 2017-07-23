
  public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        int length=num.length;
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(length<1||size>length||size==0) return result;
        size--;
        for(int i=0;size<length;i++,size++){            
            result.add(fun(num,i,size));
        }
        return result;
    }
    public int fun(int []num,int i,int j){
        int result=num[i];
        while(++i<=j){
            if(result<num[i]){
                result=num[i];
            }
        }
        return result;
    }