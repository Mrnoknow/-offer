bool Find(int target, vector<vector<int> > array) {
     	int num=array.size();
        if(num<1) return false;
        int nume=array[0].size();
        if(nume<1) return false;
        int i=0,j=0;
        while(i<num&&j<nume&&array[i][j]<target){
                if(array[i][j]==target) return true;
                i++;
                j++;
        }
        if(i==num&&j==nume) return false;
        if(i==num) i--;
        if(j==nume) j--;
        int numi=i;
        int numj=j;
        while(numj<nume&&numi>=0){
            if(array[numi][numj]>target) numi--;
            else if(array[numi][numj]<target) numj++;
            else return true;
        }
        numi=i;
        numj=j;
        while(numj>=0&&numi<num){
            if(array[numi][numj]>target) numj--;
            else if(array[numi][numj]<target)numi++;
            else return true;
        }
        return false;
        
    }