    public boolean duplicate(int numbers[],int length,int [] duplication) {//这个要看是有多大的数据，如果小，可以直接用int数组记录一次，扫描一次，如果特别大直接就用快排
        if(length<2){
            duplication[0]=-1;
            return false;
        }
        duplication[0]=fun(0,length-1,numbers);
        if(duplication[0]==0){
            if(numbers[1]!=0){
                duplication[0]=-1;
                return false;
            }
        } 
        return true;
    }
    public int fun(int low,int high,int numbers[]){
        if(low>=high) return 0;
        int num=numbers[low];
        int i=low;
        int j=high;
        while(i<j){
          while(i<j&&num<=numbers[j]){
              if(num==numbers[j]) return num;
              j--;
          }
          while(i<j&&num>=numbers[i]){
              if(num==numbers[i]&&i!=low) return num;
              i++;
          }
            if(i<j){
                int tem=numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=tem;
            }
        }
        numbers[low]=numbers[i];
        numbers[i]=num;
        num=fun(low,i-1,numbers);
        if(num!=0) return num;
        else return fun(i+1,high,numbers);
    }