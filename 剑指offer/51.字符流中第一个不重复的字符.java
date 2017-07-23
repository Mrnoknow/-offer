 //Insert one char from stringstream
    int a[]=new int[128];
    int b[]=new int[128];
    int i=0;
    public void Insert(char ch)
    {
        int num=ch;
        a[num]++;
        if(a[num]==1){
            b[i++]=num;
        }else if(a[num]==2){
            int j=0;
            while(b[j]!=num&&j<=i){
                j++;
            }
            if(b[j]==num) b[j]=-1;
        }
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        int j=0;
        while(b[j]==-1&&j<i){
            j++;
        }
        if(j<i){
            
            char c=(char)b[j];
            return c;
        }
        return '#';
    }