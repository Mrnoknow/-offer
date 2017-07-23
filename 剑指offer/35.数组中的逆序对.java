    int result=0;
    public int InversePairs(int [] array) {
        int length=array.length;
        if(length<2) return 0;
        int tem[] = new int[length];
        merage(array,tem,0,length-1);
        return result;
    }
     public  void merage(int array[],int tem[],int left,int right){
      if(left<right){
        int middle=(left+right)/2;
        merage(array,tem,left,middle);
        merage(array,tem,middle+1,right);
        merageSort(array,tem,left,middle,right);
        
      }
    }
    public  void merageSort(int array[],int tem[],int left,int middle,int right){
      int i=left;
      int j=middle+1;
      int k=left;
      while(i<=middle&&j<=right){
        if(array[i]>array[j]){
          result+=middle-i+1;
                result%=1000000007;
          tem[k++]=array[j++];
        }
        else tem[k++]=array[i++];
      }
      while(i<=middle)tem[k++]=array[i++];
      while(j<=right)tem[k++]=array[j++];
      for(int m=left;m<=right;m++) array[m]=tem[m];
    }