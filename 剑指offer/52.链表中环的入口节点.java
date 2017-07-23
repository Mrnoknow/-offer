 public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null||pHead.next==null) return null;
        ListNode pre=pHead.next;
        ListNode pLast=pHead.next.next;
        while(pre!=pLast){
            pre=pre.next;
            pLast=pLast.next.next;
        }
        pLast=pHead;
        while(pre!=pLast){
            pre=pre.next;
            pLast=pLast.next;
        }
        return pre;
    }