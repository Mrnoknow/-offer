 public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        int length1 = 0;
        int length2 = 0;
        while(p1!=null){
            length1++;
            p1=p1.next;
        }
        while(p2!=null){
            length2++;
            p2=p2.next;
        }
        if(length1>length2){
            while(length1!=length2){
                length1--;
                pHead1=pHead1.next;
            }
            while(pHead1!=pHead2){
                pHead1=pHead1.next;
                pHead2=pHead2.next;
            }
            return pHead1;
        }else{
            while(length1!=length2){
                length2--;
                pHead2=pHead2.next;
            }
            while(pHead1!=pHead2){
                pHead1=pHead1.next;
                pHead2=pHead2.next;
            }
            return pHead1;
        }
       
    }