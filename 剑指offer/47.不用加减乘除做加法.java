public int Add(int num1,int num2) {
        int sum,tem;
        while(num2!=0){
          sum=num1^num2;
          tem=(num1&num2)<<1;
            num1=sum;
            num2=tem;
        }
        return num1;
    }