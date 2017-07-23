public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null||pHead.next==null) return pHead;
        ListNode result=new ListNode(-1);
        result.next=pHead;
        ListNode pre=result;
        ListNode pLast=pre.next.next;
        int flag=0;
        while(pLast!=null){
            if(pre.next.val==pLast.val){
                pLast=pLast.next;
                flag=1;
            }else{
                if(flag==1){
                    pre.next=pLast;
                    pLast=pLast.next;
                }else{
                    pre=pre.next;
                    pLast=pLast.next;
                }
                flag=0;
            }
        }
        if(flag==1) pre.next=null;;
        return result.next;
    }