vector<int> printMatrix(vector<vector<int> > matrix) {
        int row=matrix.size();
        vector<int> result;
        if(!row) return result;
        int col=matrix[0].size();
        if(row==1) return matrix[0];
        int start=0;
		int i;
		while(row>start*2&&col>start*2){
			int x=col-1-start;
			int y=row-1-start;
			for( i=start;i<=x;i++){
				result.push_back(matrix[start][i]);
			}
			if(start<y){
			for( i=start+1;i<=y;i++){
				result.push_back(matrix[i][x]);
			}
			}
			if(start<y&&start<x){
			for( i=x-1;i>=start;i--){
				result.push_back(matrix[y][i]);
		}}
			if(start<y-1&&start<x){
			for( i=y-1;i>start;i--){
				
				result.push_back(matrix[i][start]);
			}
			}
			start++;
		}
        return result;
    }