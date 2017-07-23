public int GetNumberOfK(int [] array , int k) {
       int length=array.length;
       if(length==0) return 0;
       int low=0;
       int high=length-1;
       int mid;
       int result=0;
        while(low<=high){
            mid=(low+high)/2;
            if(array[mid]==k){
                result++;
                int m=mid+1;
                while(m<length&&array[m]==k){
                    m++;
                    result++;
                }
                m=mid-1;
                while(m>=0&&array[m]==k){
                    m--;
                    result++;
                }
                return result;
            }else if(array[mid]>k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return result;    
    }