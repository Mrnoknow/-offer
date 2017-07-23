public int FirstNotRepeatingChar(String str) {
        int length=str.length();
        if(length==0) return -1;
        if(length==1) return 1;
        int nums[]=new int[256];
        
        for(int i=0;i<length;i++){
            nums[str.charAt(i)]++;
        }
        for(int i=0;i<length;i++){
            if(nums[str.charAt(i)]==1) return i;
        }
        return 0;
    }