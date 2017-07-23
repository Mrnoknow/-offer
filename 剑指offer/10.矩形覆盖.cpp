   int rectCover(int number) {
        if(number==0) return 0;
        int result=1;
        int m=0;
        while(number--){
            result+=m;
            m=result-m;
        }
        return result;
    }