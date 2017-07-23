void reOrderArray(vector<int> &array) {
        int num=array.size()-1;
        int m=0;   
        int n=0;
		int tem;
       	int t=0;
        while(m<=num){
			 t++;
			 n=m;
			 while(m<=num&&(!(array[m]&1))){
				 m++;
			 }
			 if(m<=num){ tem=array[m]; t=n+1;}
			 else return;
			 while(n<m){
				 array[m--]=array[m-1];
			 }
			 array[m]=tem;
			 m=t;
        }
    }