    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null) return null;
        if(pHead.next==null){ 
            RandomListNode p=new RandomListNode(pHead.label);
            if(pHead.random!=null) p.random=p;
            return p;
        }
        RandomListNode pPre=pHead;
        while(pPre!=null){
            RandomListNode node=new RandomListNode(pPre.label);
            node.next=pPre.next;
            pPre.next=node;
            pPre=node.next;
        }
        RandomListNode pLast=pHead;
        while(pLast!=null){
            if(pLast.random!=null){
                pLast.next.random=pLast.random.next;
            }
            pLast=pLast.next.next;
        }
         RandomListNode pp=new RandomListNode(0);
        RandomListNode result=pp;
        while(pHead!=null){
             RandomListNode t=pHead.next;
             pHead.next=t.next;
             pp.next=t;
             t.next=null;
             pp=pp.next;
             pHead=pHead.next;
        }
        return result.next;
    }