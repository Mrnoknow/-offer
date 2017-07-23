    int minNumberInRotateArray(vector<int> rotateArray) {
        int num=rotateArray.size();
        if(num==0) return 0;
        int high=num-1;
        int low=0;
        int mid=low;
		while(rotateArray[low]>=rotateArray[high]){
            mid=(high+low)/2;
			if(high-low<=1) return rotateArray[high];
            
			if(rotateArray[low]==rotateArray[high]&&rotateArray[mid]==rotateArray[high]){
				for(int i=low+1;i<high;i++){
					if(rotateArray[i]<rotateArray[low]){
						return rotateArray[i];
					}
				}
			}
            if(rotateArray[mid]>rotateArray[high]){
				low=mid;
			}
			else{
				high=mid;
			}
		}
        return rotateArray[mid];
    }