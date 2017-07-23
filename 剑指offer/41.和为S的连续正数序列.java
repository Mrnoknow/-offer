 public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<Integer> num;
        ArrayList<ArrayList<Integer> > result=new ArrayList<ArrayList<Integer>>();
        int start=1;
        int end=2;
        int cur=start+end;
        int mid=sum>>1+1;
        while(start<end&&end<sum){
            if(cur==sum){
                num=Fun(start,end);
                result.add(num);
                end++;
                cur+=end;
            }else if(cur<sum){
                end++;
                cur+=end;
            }else if(cur>sum){
                cur-=start;
                start++;
            }
        }
        return result;
    }
    public ArrayList<Integer> Fun(int start,int end){
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int i=start;i<=end;i++){
            result.add(i);
        }
        return result;
    }
    