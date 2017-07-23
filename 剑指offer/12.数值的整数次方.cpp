  double Power(double base, int exponent) {
        if(base==0||base==1) return base;
        if(base!=0&&exponent==0) return 1;
        double result=base;
        int num=exponent;
        if(num>0){
            num=num>>1;
            while(num){
                result*=result;
                num=num>>1;
              }
        if(exponent&1){
            result*=base;
        }
         
        }else{
            num=-num;
            num=num>>1;
            while(num){
                result*=result;
                num=num>>1;
            }
            result=1.0/result;
            if((-exponent)&1){
                result*=1.0/base;
            }
        }
        
        return result;
    }