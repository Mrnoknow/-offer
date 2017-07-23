    bool IsPopOrder(vector<int> pushV,vector<int> popV) {
        int num=pushV.size()-1;
        if(num==-1) return true;
        stack<int> m_data;
        int i=0;
        int flag=0;
        while(flag<=num){
           while(i<=num&&(m_data.empty()||m_data.top()!=popV[flag])){
               m_data.push(pushV[i]);
               i++;
           }
           if(m_data.top()!=popV[flag]){
               return false;
           }
           m_data.pop();
           flag++;
          
        }
        return true;
    }