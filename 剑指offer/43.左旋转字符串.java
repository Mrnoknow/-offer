public String LeftRotateString(String str,int n) {
        int length=str.length();
        if(length<2) return str;
        int num=n%length;
        if(num==0) return str;
        String result="";
        for(int i=num;i<length;i++){
            result+=str.charAt(i);
        }
        for(int j=0;j<num;j++){
            result+=str.charAt(j);
        }
        return result;
    }