  public int StrToInt(String str) {
        int length=str.length();
        if(length==0) return 0;
        int flag=0;
        int i=0;
        int result=0;
        int num;
        if(str.charAt(i)=='-') {flag=1;i++;}
        else if(str.charAt(i)=='+') {i++;}
        while(i<length){
            num=str.charAt(i)-'0';
            if(num>=10||num<0){
                return 0;
            }else result=result*10+num;
            i++;
        }
        if(flag==1) result=0-result;
        return result;
    }