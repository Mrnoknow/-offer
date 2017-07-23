 ListNode* ReverseList(ListNode* pHead) {
        if(pHead==NULL||pHead->next==NULL) return pHead;
        ListNode *p=pHead;
        
        ListNode *m=p->next;
        ListNode *b;
        p->next=NULL;
        while(m->next){
            b=m->next;
            m->next=p;
            p=m;
            m=b;
        }
        m->next=p;
        return m;
    }