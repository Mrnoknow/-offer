void replaceSpace(char *str,int length) {
         if (str == NULL || length <= 0){
            return;
        }
        int n=length-1;
        int i=0;
        while(str[i]!='\0'){
            if(str[i]==' '){
                length+=2;
            }
            i++;
        }
        str[length]='\0';
		length-=1;
        while(n<length&&n!=-1){
            if(str[n]==' '){
                str[length--]='0';
                str[length--]='2';
                str[length--]='%';
            }else str[length--]=str[n];
            n--;
		}
			
        
	}